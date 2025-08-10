import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Veiculo v1 = new Veiculo("AAA1A11");
        Veiculo v2 = new Veiculo("BBB2A22");
        Veiculo v3 = new Veiculo("CCC3C33");
        Veiculo v4 = new Veiculo("DDD4D44");
        Veiculo v5 = new Veiculo("KKK4K69");

        Scanner in = new Scanner(in);
        System.out.println("Selecione uma das seguintes opções:");
        System.out.println("1 - Abastecer\n2 - Dirigir\n3 - Fim");
        int n = in.nextInt();
        switch (n) {
            case 1:
            
                break;
            case 2:

                break;
            case 3:

                break;
            default:
            System.out.println("Por favor, digite um valor válido (de 1 a 3)!");
                break;
        }        

        /* String pais = args[0];
        String codigo = args[1];
        Double combustivelNecessario = Double.parseDouble(args[2]);
        Double distanciaParaPercorrer = Double.parseDouble(args[3]);

        Placa p1 = new Placa(pais, codigo);
        
        Veiculo v = new Veiculo(p1);
        System.out.println("Dados do veiculo antes de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.abastece(combustivelNecessario);
        System.out.println("Dados do veiculo depois de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.dirige(distanciaParaPercorrer);
        System.out.println("Dados do veiculo depois de percorrer " + distanciaParaPercorrer +  "km:");
        System.out.println(v);
        System.out.println("----------------");
        */ 
    }
}