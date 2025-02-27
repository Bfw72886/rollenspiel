public class Charakterersteller {
    public Krieger createKrieger() {
        return new Krieger("Keule", 100, 1, false, 5, 20);
    }

    public Magier createMagier() {
        return new Magier("Bimsala", 100, 1, false, 5, 50);
    }

    public Spaeher createSpaeher() {
        return new Spaeher("Augä", 100, 1, false, 5, 50);
    }
}
