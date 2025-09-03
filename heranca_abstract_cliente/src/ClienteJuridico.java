public class ClienteJuridico extends Cliente {
    private int mensalidade;

    public ClienteJuridico(String nome, double mensalidade) {
        super(nome);
        this.mensalidade = mensalidade;
    }

    public void setMensalidade(int mensalidade) {

    }
}
