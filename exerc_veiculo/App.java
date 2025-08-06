public class App{
    public static void main(String args[]){
        String pais = args[0];
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
        System.out.println("Dados do veiculo depois de percorrer " + distanciaParaPercorrer +  ":");
        System.out.println(v);
        System.out.println("----------------");
        }
}