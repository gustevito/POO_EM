public class TestaFuncionarios {
    public static void main(String[] args) {
        CadastroFuncionarios cadastro = new CadastroFuncionarios();

        System.out.println("=== TESTES CADASTRO FUNCIONÁRIOS ===\n");

        System.out.println("2a) Funcionários com insalubridade e dependentes: "
                + cadastro.getInsalubridadeDependentes().size());

        System.out.println("2b) Quantidade com dependentes: "
                + cadastro.quantidadeFuncionariosComDependentes());

        System.out.printf("2c) Somatório salário bruto > 5000: %.2f\n",
                cadastro.somatorioSalarioBruto());

        System.out.println("2d) Aplicando aumento 20% para insalubres...");
        cadastro.aumentaSalarioInsalubres();

        System.out.println("2e) Nome/Matrícula (salário bruto > 10% base): "
                + cadastro.getNomeMatriculaSalarioBrutoMaiorQueBase().size() + " funcionários");

        System.out.printf("2f) Média salarial sem insalubridade: %.2f\n",
                cadastro.mediaSalarialDosQueNaoTemInsalubridade());

        System.out.println("2g) Nomes com matrícula < 500: "
                + cadastro.nomesDosQueTemMatriculaMenorQue500().size() + " funcionários");

        int matriculaTeste = cadastro.getFuncionarios().get(0).getMatricula();
        System.out.printf("2h) Salário líquido matrícula %d: %.2f\n",
                matriculaTeste, cadastro.getSalarioLiquido(matriculaTeste));

        System.out.println("2h) Salário líquido matrícula inexistente: "
                + cadastro.getSalarioLiquido(9999));
    }
}
