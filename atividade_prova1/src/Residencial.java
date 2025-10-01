public class Residencial extends Imovel {
    private static final int areaMax = 200;
    private static double vr = 1;
    private static final int areaSup = 1000;

    public static double getVr() {
        return vr;
    }

    public static void setVr(double valor) {
        vr = valor;
    }

    public double calculaImposto() {
        int terreno = getAreaConstruida();
        if (terreno <= areaMax) {
            return 0;
        }
        double valorFinal = (terreno - areaMax) * vr;
        if (terreno > areaSup) {
            valorFinal += (vr * 100);
        }
        return valorFinal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
