public class Seguro implements Tributavel {
    private double taxa;

    public Seguro(double taxa) {
        this.taxa = 42;
    }

    public double getTaxa() {
        return taxa;
    }
}
