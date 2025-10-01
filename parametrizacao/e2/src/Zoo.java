public class Zoo<E extends Animal> {

    private int count;
    private Object[] listaAnimais;

    public Zoo(int capacidadeMaxima) {
        this.count = 0;
        listaAnimais = new Object[capacidadeMaxima];
    }

    public boolean addAnimal(E animal) {
        if (count < listaAnimais.length) {
            listaAnimais[count] = animal;
            count++;
            return true;
        }
        return false;
    }

    public void listaAnimais() {
        int i = 0;
        System.out.println("Listando animais...");
        for (Object animal : listaAnimais) {
            System.out.println("{ " + animal + " }");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
