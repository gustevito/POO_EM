public class ClienteFisico extends Cliente {
    private int idade;
    private double salario;

    public ClienteFisico(String nome, int idade, double salario) {
        super(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
