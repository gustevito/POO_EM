import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TextAnalysis {
	private Map<String, Set<String>> palavraParaArquivos;
	private Map<String, Map<String, Integer>> arquivoParaPalavras;

	public TextAnalysis(String[] files) {
		palavraParaArquivos = new HashMap<>();
		arquivoParaPalavras = new HashMap<>();

		for (String fname : files) {
			this.carregaDados(fname);
		}
	}

	public void listarArquivos(String palavra) {
		palavra = palavra.toLowerCase();
		System.out.println("\nArquivos contendo a palavra '" + palavra + "' ");

		Set<String> arquivos = palavraParaArquivos.get(palavra);

		if (arquivos == null) {
			System.out.println("A palavra não foi encontrada em nenhum arquivo.");
		} else {
			System.out.println("Encontrada em " + arquivos.size() + " arquivo(s):");
			for (String arquivo : arquivos) {
				System.out.println("  - " + arquivo);
			}
		}
	}

	public void listarArquivos(String[] palavras) {
		System.out.println("\nArquivos contendo TODAS as palavras: " +
				String.join(", ", palavras) + " ");

		String primeiraPalavra = palavras[0].toLowerCase();
		Set<String> resultado = palavraParaArquivos.get(primeiraPalavra);

		if (resultado == null) {
			System.out.println("A palavra '" + primeiraPalavra + "' não foi encontrada.");
			return;
		}

		resultado = new HashSet<>(resultado);

		for (int i = 1; i < palavras.length; i++) {
			String palavra = palavras[i].toLowerCase();
			Set<String> arquivos = palavraParaArquivos.get(palavra);
			if (arquivos != null) {
				resultado.retainAll(arquivos);
			}
		}

		if (resultado.isEmpty()) {
			System.out.println("Não há arquivos contendo todas as palavras.");
		} else {
			System.out.println("Encontradas em " + resultado.size() + " arquivo(s):");
			for (String arquivo : resultado) {
				System.out.println("  - " + arquivo);
			}
		}
	}

	public void listarPalavras(String fileName) {
		System.out.println("\nPalavras do arquivo '" + fileName + "' ");
		Map<String, Integer> palavras = arquivoParaPalavras.get(fileName);
		if (palavras == null) {
			System.out.println("Arquivo não encontrado ou vazio.");
			return;
		}
		Map<String, Integer> palavrasOrdenadas = new TreeMap<>(palavras);

		System.out.println("Total de palavras únicas: " + palavras.size());
		System.out.println("\nPalavra : Frequência");
		System.out.println("---------------------");

		for (Map.Entry<String, Integer> entry : palavrasOrdenadas.entrySet()) {
			System.out.printf("%-20s : %d%n", entry.getKey(), entry.getValue());
		}
	}

	public void listarPalavrasComuns(String f1, String f2) {
		System.out.println("\nPalavras comuns entre '" + f1 + "' e '" + f2 + "' ");

		Map<String, Integer> palavrasF1 = arquivoParaPalavras.get(f1);
		Map<String, Integer> palavrasF2 = arquivoParaPalavras.get(f2);

		Set<String> palavrasComuns = new HashSet<>(palavrasF1.keySet());
		palavrasComuns.retainAll(palavrasF2.keySet());

		if (palavrasComuns.isEmpty()) {
			System.out.println("Não há palavras em comum.");
		} else {
			Map<String, Integer> palavrasOrdenadas = new TreeMap<>();
			for (String palavra : palavrasComuns) {
				palavrasOrdenadas.put(palavra, palavrasF1.get(palavra));
			}

			System.out.println("Total de palavras comuns: " + palavrasComuns.size());
			System.out.println("\nPalavra         | Freq em " + f1 + " | Freq em " + f2);
			System.out.println("----------------+-----------------+----------------");

			for (String palavra : palavrasOrdenadas.keySet()) {
				System.out.printf("%-15s | %15d | %14d%n",
						palavra,
						palavrasF1.get(palavra),
						palavrasF2.get(palavra));
			}
		}
	}

	public void listarTopN(String fileName, int n) {
		System.out.println("\nTop " + n + " palavras mais frequentes em '" + fileName + "':");

		Map<String, Integer> palavras = arquivoParaPalavras.get(fileName);

		if (palavras == null) {
			System.out.println("Arquivo não encontrado ou vazio.");
			return;
		}

		palavras.entrySet()
				.stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.limit(n)
				.forEach(entry -> System.out.printf("%-20s : %d%n", entry.getKey(), entry.getValue()));
	}

	private void carregaDados(String fileName) {
		Path path1 = Paths.get(fileName);
		Map<String, Integer> palavrasDoArquivo = new HashMap<>();

		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				line = line.toLowerCase().replaceAll("[^a-zA-Záéíóúçãõà-]", " ");
				String[] palavras = line.split("\\s+");

				for (String palavra : palavras) {
					if (palavra.isEmpty()) {
						continue;
					}

					if (!palavraParaArquivos.containsKey(palavra)) {
						palavraParaArquivos.put(palavra, new HashSet<>());
					}
					palavraParaArquivos.get(palavra).add(fileName);
					palavrasDoArquivo.put(palavra, palavrasDoArquivo.getOrDefault(palavra, 0) + 1);
				}
			}
			arquivoParaPalavras.put(fileName, palavrasDoArquivo);
		} catch (IOException e) {
			System.out.println("Erro na leitura de " + fileName + ": " + e.getMessage());
		}
	}
}