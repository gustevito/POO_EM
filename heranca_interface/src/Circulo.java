public class Circulo {
    private double raio;

    public Circulo(double valor) {
        this.raio = valor;
    }

    public double getRaio() {
        return raio;
    }

    public double calculaArea() {
        return Math.PI * (this.raio * this.raio);
    }
}
