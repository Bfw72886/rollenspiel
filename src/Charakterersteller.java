import java.util.ArrayList;

public class Charakterersteller {
    private DBreader dbreader;
    private ArrayList<Monster> monsters = new ArrayList<>();

    public Charakterersteller() {
        dbreader = new DBreader();
        monsters = dbreader.getMonsters();
    }

    public Krieger createKrieger() {
        return new Krieger("Keule", 100, 1, false, 20, 20);
    }

    public Magier createMagier() {
        return new Magier("Bimsala", 100, 1, false, 20, 50);
    }

    public Spaeher createSpaeher() {
        return new Spaeher("Augä", 100, 1, false, 20, 50);
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }
}
