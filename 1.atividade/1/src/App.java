import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String[] files = new String[] {
				"texto01.txt", "texto02.txt", "texto03.txt",
				"texto04.txt", "texto05.txt", "texto06.txt",
				"texto07.txt", "texto08.txt", "texto09.txt",
				"texto10.txt"
		};

		System.out.println("Carregando arquivos...");
		TextAnalysis dicionario = new TextAnalysis(files);
		System.out.println("Arquivos carregados!");

		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 6) {
			System.out.println("\nInsira o numero referente à opção que deseja executar:");
			System.out.println("1 - Buscar palavra em arquivos");
			System.out.println("2 - Buscar mais de uma palavra em arquivos");
			System.out.println("3 - Listar palavras de um arquivo");
			System.out.println("4 - Palavras comuns entre dois arquivos");
			System.out.println("5 - Top N palavras mais frequentes");
			System.out.println("6 - Sair");

			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
				case 1:
					System.out.print("\nDigite a palavra: ");
					String palavra = scanner.nextLine();
					dicionario.listarArquivos(palavra);
					break;

				case 2:
					System.out.print("\nQuantas palavras deseja buscar? ");
					int numPalavras = scanner.nextInt();
					scanner.nextLine();

					String[] palavras = new String[numPalavras];
					for (int i = 0; i < numPalavras; i++) {
						System.out.print("Palavra " + (i + 1) + ": ");
						palavras[i] = scanner.nextLine();
					}
					dicionario.listarArquivos(palavras);
					break;

				case 3:
					System.out.print("\nDigite o nome do arquivo (ex: texto01.txt): ");
					String arquivo = scanner.nextLine();
					dicionario.listarPalavras(arquivo);
					break;

				case 4:
					System.out.print("\nDigite o primeiro arquivo (ex: texto01.txt): ");
					String arquivo1 = scanner.nextLine();
					System.out.print("Digite o segundo arquivo (ex: texto02.txt): ");
					String arquivo2 = scanner.nextLine();
					dicionario.listarPalavrasComuns(arquivo1, arquivo2);
					break;

				case 5:
					System.out.print("\nDigite o nome do arquivo (ex: texto01.txt): ");
					String arqTop = scanner.nextLine();
					System.out.print("Digite quantas palavras exibir (ex: 10): ");
					int n = scanner.nextInt();
					scanner.nextLine();
					dicionario.listarTopN(arqTop, n);
					break;

				case 6:
					System.out.println("\nEncerrando programa...");
					break;

				default:
					System.out.println("\nOpçao inválida!");
			}
		}

		scanner.close();
		System.out.println("-----------------------------------------------");
		System.out.println("## FIM ##");
	}
}