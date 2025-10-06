import java.util.HashSet;
import java.util.Scanner;

public class Eratostenes {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Defina n (valor limite): ");
        int n = t.nextInt();
        if (n < 1) {
            System.out.println("Informe um valor inteiro.");
            System.exit(0);
        }

        int lim = (int) Math.sqrt(n);

        HashSet<Integer> conjunto = new HashSet<>();
        for (int i = 2; i < n; i++) {
            conjunto.add(i);
        }

        System.out.println("Conjunto: " + conjunto);

        for (int multiplo = 2; multiplo < lim; multiplo++) {
            HashSet<Integer> temp = new HashSet<>();
            for (Integer aux : conjunto) {
                if ((aux != multiplo) && ((aux % multiplo) == 0)) {
                    temp.add(aux);
                }
            }
            conjunto.removeAll(temp);
        }

        System.out.println("\nCrivo de Eratóstenes: " + conjunto);
    }
}
