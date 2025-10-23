import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CadastroFuncionarios {
    private List<Funcionario> lstf;

    public CadastroFuncionarios() {
        lstf = new LinkedList<>();
        Random r = new Random();

        for (int i = 0; i < 40; i++) {
            int matricula = r.nextInt(1000) + 100;
            String nome = "Fulano" + i;
            boolean insalubridade = r.nextBoolean();
            int nroDep = r.nextInt(3) + 1;
            double salBase = (r.nextDouble() * 15000) + 500;
            Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
            lstf.add(f);
        }
    }

    public List<Funcionario> getFuncionarios() {
        return Collections.unmodifiableList(lstf);
    }

    public List<Funcionario> getInsalubridadeDependentes() {
        return lstf.stream()
                .filter(f -> f.getInsalubridade() && f.getNroDependentes() > 0)
                .collect(Collectors.toList());
    }

    public long quantidadeFuncionariosComDependentes() {
        return lstf.stream()
                .filter(f -> f.getNroDependentes() > 0)
                .count();
    }

    public double somatorioSalarioBruto() {
        return lstf.stream()
                .filter(f -> f.getSalarioBruto() > 5000)
                .mapToDouble(Funcionario::getSalarioBruto)
                .sum();
    }

    public void aumentaSalarioInsalubres() {
        lstf.stream()
                .filter(Funcionario::getInsalubridade)
                .forEach(f -> f.aumentaSalBase(1.2));
    }

    public List<String> getNomeMatriculaSalarioBrutoMaiorQueBase() {
        return lstf.stream()
                .filter(f -> f.getSalarioBruto() > f.getSalarioBase() * 1.1)
                .map(f -> f.getNome() + " - " + f.getMatricula())
                .collect(Collectors.toList());
    }

    public double mediaSalarialDosQueNaoTemInsalubridade() {
        return lstf.stream()
                .filter(f -> !f.getInsalubridade())
                .mapToDouble(Funcionario::getSalarioBruto)
                .average()
                .orElse(0.0);
    }

    public List<String> nomesDosQueTemMatriculaMenorQue500() {
        return lstf.stream()
                .filter(f -> f.getMatricula() < 500)
                .map(Funcionario::getNome)
                .collect(Collectors.toList());
    }

    public double getSalarioLiquido(int matricula) {
        return lstf.stream()
                .filter(f -> f.getMatricula() == matricula)
                .mapToDouble(Funcionario::getSalarioLiquido)
                .findFirst()
                .orElse(-1.0);
    }

    @Override
    public String toString() {
        return "CadastroFuncionarios [lstf=" + lstf + "]";
    }
}
