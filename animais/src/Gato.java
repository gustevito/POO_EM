public class Gato extends Animais {
    private String especie;

    public Gato(String especie, String raca, String cor) {
        super(especie, raca, cor);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void miado() {
        System.out.println("O gato mia.");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "especie='" + getEspecie() + '\'' +
                ", raca='" + getRaca() + '\'' +
                ", cor='" + getCor() + '\'' +
                '}';
    }
}
