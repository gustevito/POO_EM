import java.util.Arrays;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("1. 1 pertence ao conjunto " + conjunto + "?");
        System.out.println(conjunto.contains(1) ? "Sim" : "Não");
        System.out.println("-------------------------");

        HashSet<Integer> conjuntoVazio = new HashSet<>(Arrays.asList());
        System.out.println("2. Vazio está contido no conjunto " + conjunto + "?");
        System.out.println(conjunto.containsAll(conjuntoVazio) ? "Sim" : "Não");
        System.out.println("-------------------------");

        HashSet<Integer> conjuntoTemp = new HashSet<>(Arrays.asList(1, 2));
        System.out.println("3. Conjunto temporário NÃO está contido no " + conjunto + "?");
        System.out.println(conjunto.containsAll(conjuntoTemp) ? "Está" : "Não está");
        System.out.println("-------------------------");

        conjunto.clear();
        conjunto.addAll(Arrays.asList(1, 2, 3, 4));

        conjuntoTemp.clear();
        conjuntoTemp.addAll(Arrays.asList(1, 2, 5));
        System.out.println("4. " + conjunto + " - " + conjuntoTemp);
        conjunto.removeAll(conjuntoTemp);

        System.out.println("R: " + conjunto);
        System.out.println("-------------------------");

    }
}
