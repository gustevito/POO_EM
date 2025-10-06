import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        System.out.println("Path: ");
        String p = "~/dev/POO_EM/1.atividades/2.collections/1.txt";
        Path filePath = Paths.get(p);

        HashMap<String, Integer> conjunto = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(filePath, Charset.forName("utf8"))) {
            String line;
            int linha = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println("L" + (linha++) + ": " + line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("# Fim #");
    }
}
