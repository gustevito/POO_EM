public abstract class Cliente {
    private String nome;

    public Cliente(String umNome) {
        this.nome = umNome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getMensalidade();
}