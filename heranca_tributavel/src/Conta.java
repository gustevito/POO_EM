public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double sacar(double valor) {
        return this.saldo - valor;
    }

    public double depositar(double valor) {
        return this.saldo + valor;
    }

    public double obterSaldo() {
        return this.saldo;
    }
}
