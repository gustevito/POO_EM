import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosLambda1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        System.out.println("a) Iterar sobre lista:");
        list.forEach(System.out::println);

        System.out.println("\nb) Primeiras letras concatenadas:");
        String primeiraLetras = list.stream()
                .map(s -> String.valueOf(s.charAt(0)))
                .collect(Collectors.joining());
        System.out.println(primeiraLetras);

        System.out.println("\nc) Lista transformada em maiúsculas:");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);

        list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        System.out.println("\nd) Nova lista em maiúsculas:");
        List<String> listaMaiuscula = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(listaMaiuscula);

        System.out.println("\ne) Elementos com >= 6 caracteres:");
        long count = list.stream()
                .filter(s -> s.length() >= 6)
                .count();
        System.out.println(count);
    }
}
