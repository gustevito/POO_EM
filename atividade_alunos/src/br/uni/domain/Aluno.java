import java.time.LocalDate;

public class Aluno {
    private String nome;
    private String matricula;
    private LocalDate dataDeNascimento;


    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int criaMatricula(){
        
    }

}
