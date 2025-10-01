public class App {
    public static void main(String[] args) {
        Zoo<Animal> meuZoo = new Zoo<>(10);

        meuZoo.addAnimal(new Tigre(50, "tigrao"));
        meuZoo.addAnimal(new Elefante(200, "elefantaço"));
        meuZoo.addAnimal(new Sapo(2, "sapao do banhado"));

    }
}
