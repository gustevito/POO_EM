import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (loop) {
            System.out.println("Digite a opção que desejas operar:\n");
            System.out.println("1 - Inserir moedas\n");
            System.out.println("2 - Conferir moedas\n");
            System.out.println("3 - Retirar moedas\n");
            int n = in.nextInt();
            in.nextLine();

            switch (n) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("ERRO: Insira um valor inteiro de 1 a 3.");
                    break;
            }
        }
    }
}
