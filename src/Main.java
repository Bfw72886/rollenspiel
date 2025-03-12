import charakters.Charakter;
import charakters.Charakterersteller;
import logic.Dungeon;

public class Main {
    public static void main(String[] args) {
        /*
        Diese drei Befehle ermöglichen dir den Zutritt in den Dungeon.
        Das gesamte Spiel findet in der Konsole statt.
        Die Steuerung findet mit den Tasten:
        [j][k][l] und <Enter>
        statt. Du kannst es also sogar mit einer Hand spielen.
        Viel Spaß!
         */
        Charakterersteller charakterersteller = new Charakterersteller();
        Charakter deinCharakter = charakterersteller.createYourCharakter();
        new Dungeon(deinCharakter).start();
    }
}