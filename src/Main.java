import charakters.Charakterersteller;
import charakters.Krieger;
import logic.Dungeon;

public class Main {
    public static void main(String[] args) {
        Charakterersteller charakterersteller = new Charakterersteller();

        Krieger krieger = charakterersteller.createKrieger();

        Dungeon dungeon = new Dungeon(krieger);
        dungeon.start();
    }
}