public class Quadrado implements AreaCalculavel {
    private double lado;

    public Quadrado(double valor) {
        this.lado = valor;
    }

    public double getLado() {
        return lado;
    }

    public double calculaArea() {
        return this.lado * this.lado;
    }
}
