public abstract class O_Animal {
    private double peso;
    private String id;

    public O_Animal(double p, String id) {
        this.id = id;
        this.peso = p;
    }

    public int getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
