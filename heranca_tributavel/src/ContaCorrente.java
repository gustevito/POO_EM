public class ContaCorrente extends Conta implements Tributavel {
    private double saldo;

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public double calculaTributos() {
        return saldo - (saldo * 0.01);
    }
}
