public class Economy extends Passagem {

    ////// construtores diferentes:
    public Economy() {
        super("CPF INVÁLIDO", "NOME INVÁLIDO");
    }

    public Economy(String cpf, String nome, double valorDaPassagem) {
        super(cpf, nome, valorDaPassagem);
    }

    @Override
    public double custoBagagem(int[] pesos, int qtd) {
        super.custoBagagem(pesos, qtd);
        if (getCustoBagagem() != 0) {
            setCustoBagagem(getCustoBagagem() + (qtd * 10));
        }
        return custoBagagem();
    }

}
