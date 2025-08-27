import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Animal> animais = new ArrayList<>();
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir Gato");
            System.out.println("2. Inserir Cachorro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do gato: ");
                    String nomeGato = sc.nextLine();
                    System.out.print("Idade do gato: ");
                    int idadeGato = sc.nextInt();
                    sc.nextLine();
                    animais.add(new Gato(nomeGato, idadeGato));
                    System.out.println("Gato inserido com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do cachorro: ");
                    String nomeCachorro = sc.nextLine();
                    System.out.print("Idade do cachorro: ");
                    int idadeCachorro = sc.nextInt();
                    sc.nextLine();
                    animais.add(new Cachorro(nomeCachorro, idadeCachorro));
                    System.out.println("Cachorro inserido com sucesso!");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
}
