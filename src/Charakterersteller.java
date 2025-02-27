public class Charakterersteller {
    public Krieger createKrieger() {
        return new Krieger("Keule", 100, 1, false, 20, 20);
    }

    public Magier createMagier() {
        return new Magier("Bimsala", 100, 1, false, 20, 50);
    }

    public Spaeher createSpaeher() {
        return new Spaeher("Augä", 100, 1, false, 20, 50);
    }

    public Monster createMonster() {
        return new Monster("Golfwolf", 100, 1, false, 20);
    }
}
