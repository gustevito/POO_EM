import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Veiculo[] veiculos = new Veiculo[5];

        veiculos[0] = new Veiculo(new Placa("Brasil", "AAA1A11"));
        veiculos[1] = new Veiculo(new Placa("Venezuela", "BBB2A22"));
        veiculos[2] = new Veiculo(new Placa("Colombia", "CCC3C33"));
        veiculos[3] = new Veiculo(new Placa("Uruguai", "DDD4D44"));
        veiculos[4] = new Veiculo(new Placa("Brasil", "KKK4K69"));

        Scanner in = new Scanner(System.in);

        boolean caseLoop = true;

        while (caseLoop) {
            System.out.println("Selecione uma das seguintes opções:");
            System.out.println("1 - Abastecer\n2 - Dirigir\n3 - Fim");
            int n = in.nextInt();
            in.nextLine(); // limpa o ENTER após o nextInt()

            switch (n) {
                case 1: {
                    boolean valido = false;
                    String placa;

                    do {
                        System.out.println("Informe a placa do veículo que você deseja abastecer:");
                        placa = in.nextLine();

                        Veiculo veiculoSelecionado = null;
                        for (Veiculo v : veiculos) {
                            // Compara a string da placa com o código da placa do veículo
                            if (placa.equals(v.getPlaca().getCodigo())) {
                                veiculoSelecionado = v;
                                break;
                            }
                        }

                        if (veiculoSelecionado != null) {
                            valido = true;
                            System.out.println("Placa selecionada: " + placa);
                            System.out.println("Informe a quantidade de combustível que você deseja abastecer:");
                            double litros = in.nextDouble();
                            in.nextLine(); // limpa o ENTER
                            veiculoSelecionado.abastece(litros);
                            System.out.println("-----------------------");
                            System.out.println("Veículo Placa: " + veiculoSelecionado.getPlaca().getCodigo() +
                                               "\nAbastecido com " + veiculoSelecionado.getCombustivelNoTanque() + " L.");
                            System.out.println("-----------------------");
                        } else {
                            System.err.println("Erro: placa inválida! Tente novamente.");
                        }

                    } while (!valido);

                    break;
                }
                case 2: {
                    boolean valido = false;
                    String placa;

                    do {
                        System.out.println("Informe a placa do veículo que você deseja utilizar:");
                        placa = in.nextLine();

                        Veiculo veiculoSelecionado = null;
                        for (Veiculo v : veiculos) {
                            if (placa.equals(v.getPlaca().getCodigo())) {
                                veiculoSelecionado = v;
                                break;
                            }
                        }

                        if (veiculoSelecionado != null) {
                            valido = true;
                            System.out.println("Placa selecionada: " + placa);
                            System.out.println("Informe a distância que você deseja percorrer:");
                            double distanciaParaPercorrer = in.nextDouble();
                            in.nextLine(); // limpa o ENTER
                            double distanciaPercorrida = veiculoSelecionado.dirige(distanciaParaPercorrer);
                            System.out.println("-----------------------");
                            System.out.println("Distância percorrida: " + distanciaPercorrida + " km.");
                            System.out.println("-----------------------");
                        } else {
                            System.err.println("Erro: placa inválida! Tente novamente.");
                        }
                    } while (!valido);

                    break;
                }
                case 3:
                    System.out.println("Veículos cadastrados no sistema:");
                    for (Veiculo v : veiculos) {
                        System.out.println(v);
                    }
                    caseLoop = false;
                    break;

                default:
                    System.out.println("Por favor, digite um valor válido (de 1 a 3)!");
                    break;
            }
        }

        in.close();
    }
}
