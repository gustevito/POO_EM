public class Animais {
    private String especie;
    private String nome;
    private String raca;
    private String cor;

    public Animais(String raca, String cor) {
        this.raca = raca;
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public String especie() {
        return especie;
    }

}
