package userinterface;

import charakters.*;


public abstract class ui {

    /**
     * Shows every stat of kaempfers (their toString()-method), use sparingly
     * @param kaempfer1
     * @param kaempfer2
     */
    public static void showKaempfersDetailed(Charakter kaempfer1, Charakter kaempfer2) {
        System.out.println(
                kaempfer1 + "\n" +
                kaempfer2);
    }

    /**
     * Shows name and gesundheit of both kaempfers
     * @param kaempfer1
     * @param kaempfer2
     */
    public static void showKaempfers(Charakter kaempfer1, Charakter kaempfer2) {
        System.out.println(
                kaempfer1.getNameAndGesundheit() + "\n" +
                kaempfer2.getNameAndGesundheit() + "\n");
    }

    public static void showKampf(int kampfNum) {
        if (kampfNum == 10) {
            System.out.println("BOSSKAMPF");
        }
        System.out.println("Kampf " + kampfNum + "\n");
    }

    public static void showSieger(Charakter sieger) {
        System.out.println(sieger.getName() + " hat gewonnen!");
    }

    public static void showSiegerGleichstand() {
        System.out.println("Beide Kämpfer haben verloren.");
    }

    public static void heilEvent(Charakter charakter) {
        System.out.println(charakter.getName() + " nimmt ein Schluck aus dem Heilbrunnen.\n"
                + charakter.getName() + " hat wieder volle Gesundheit.");
    }

    public static void itemEventKrieger(Krieger krieger, int zusatzRuestung) {
        System.out.println(krieger.getName() + " findet einen Helm.\n"
                + krieger.getName() + " setzt ihn auf den bereits vorhandenen Helm und erhält "
                + zusatzRuestung + " Rüstung!");
    }

    public static void itemEventMagier(Magier magier, int zusatzMana) {
        System.out.println(magier.getName() + " findet einen Manatrank.\n"
                + magier.getName() + " trinkt ihn aus und erhält "
                + zusatzMana + " Mana!");
    }

    public static void itemEventSpaeher(Spaeher spaeher, int zusatzBeweglichkeit) {
        System.out.println(spaeher.getName() + " findet ein Fläschchen Öl.\n"
                + spaeher.getName() + " reibt sich damit ein und erhält "
                + zusatzBeweglichkeit + " Beweglichkeit!");
    }

    public static void belohnungsAuswahl() {
        System.out.println(
                """
                        Wähle deine Belohnung:
                        [j] Heilbrunnen
                        [k] Gegenstandsgrube
                        <Enter> zum Bestätigen"""
        );
    }

    public static void eingabeAufforderung() {
        System.out.print("> ");
    }

    public static void enterAufforderung() {
        System.out.println("<Enter> zum Fortfahren");
    }

    public static void dungeonVerloren(Charakter charakter) {
        System.out.println(charakter.getName() + " wurde getötet.");
    }

    public static void dungeonGewonnen(Charakter charakter) {
        System.out.printf("""
                {\\     /}
                 >`.()'<        Fee Evangelyne:
                {@ /|\\/@}       %s hat den Dungeon abgeschlossen!
                 `/'|`~'        Glückwunsch!!!
                    \\\\
                    //
                   ''
                   """, charakter.getName());
    }

    public static void levelUp(Charakter charakter, int newLevel, int healthRaise) {
        System.out.println(charakter.getName() + " hat Level " + newLevel + " erreicht!");
        System.out.println(charakter.getName() + "s Gesundheit ist um " + healthRaise + " gestiegen.");
    }

    public static void devilDealGranted() {
        System.out.println("""
                Dämon Mephisto: Oh, eine verlorene Seele!
                                Lass mich dir etwas helfen...
                                Natürlich zu dem Preis deiner Leben.
                """);
    }

    public static void devilDealRefused() {
        System.out.println("""
                Dämon Diavolo:  DU VERDAMMTER NARR!
                                OHNE EIN OPFER HIER AUFZUKREUZEN...
                                NUTZLOS NUTZLOS NUTZLOS!!!
                """);
    }

    public static void ownError(String inWhichMethod) {
        System.out.println("Something went wrong in the " + inWhichMethod + " method.");
    }
}
