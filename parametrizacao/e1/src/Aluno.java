public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    // ** testar toString combinando com super
    // @Override
    // public String toString() {
    // return super.toString("aaaa");
    // }
}
