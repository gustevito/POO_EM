public class Passagem {
    private String cpf;
    private String nome;
    private String assento;
    private double custoPassagem;
    private double custoBagagem;

    public Passagem(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
        // nao define assento diretamente no construtor pois não é obrigatório comprar
        // uma passagem com assento definido
    }

    public double defineAssento(String assento) {
        this.assento = assento;
        if (assento != null)
            return 5.0;
        return 0;
    }

    public double custoBagagem(int[] pesos, int qtd) {
        if()

        
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getAssento() {
        return assento;
    }

    public double getCustoPassagem() {
        return custoPassagem;
    }

    // protected
    protected double getCustoBagagem() {
        return custoBagagem;
    }

    protected void setCustoBagagem(double custoBagagem) {
        this.custoBagagem = custoBagagem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Passagem: \n");
        sb.append("CPF: " + this.cpf);
        sb.append("\nNome: " + this.nome);
        sb.append("\nAssento: " + this.assento);
        sb.append("\nValor: " + this.custoPassagem);

        return sb.toString();
    }
}
