public class Cachorro extends Animais {
    private String especie;

    public Cachorro(String especie, String raca, String cor) {
        super(raca, cor);
    }

    public getEspecie(){
        return especie;
    }

    public setEspecie(String especie){
        this.especie = especie;
    }

    public void latido() {
        System.out.println("O cachorro late.");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "especie='" + getEspecie() + '\'' +
                ", raca='" + getRaca() + '\'' +
                ", cor='" + getCor() + '\'' +
                '}';
    }
}
