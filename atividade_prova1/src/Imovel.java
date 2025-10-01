public abstract class Imovel {
    private String proprietario;
    private int areaConstruida;
    private Geo localizacao;

    public String getProprietario() {
        return proprietario;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public Geo getLocalizacao() {
        return localizacao;
    }

    public abstract double calculaImposto();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proprietário: " + proprietario);
        sb.append("Área Construída: " + areaConstruida);
        sb.append("Geolocalização " + localizacao);

        return sb.toString();
    }
}