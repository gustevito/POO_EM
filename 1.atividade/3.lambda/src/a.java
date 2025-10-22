import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        // a
        list.stream().forEach(System.out::println);

        // b
        String concatena = list.stream()
                .map(p -> p.String.valueOf());

        System.out.println(concatena);
    }
}
