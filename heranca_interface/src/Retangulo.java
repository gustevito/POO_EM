public class Retangulo {
    private double lado;
    private double altura;

    public Retangulo(double valorLado, double valorAltura) {
        this.lado = valorLado;
        this.altura = valorAltura;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaArea() {
        return this.lado * this.altura;
    }
}
