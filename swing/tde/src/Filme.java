public class Filme {
    private String nome;
    private String genero;
    private double avaliacao;
    private double duracao;

    public Filme(String nome, String genero, double avaliacao, double duracao) {
        nome = this.nome;
        genero = this.genero;
        if (avaliacao < 0 || avaliacao > 10)
            throw new IndexOutOfBoundsException();
        avaliacao = this.avaliacao;
        if (duracao < 0)
            throw new IndexOutOfBoundsException();
        duracao = this.duracao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

}
