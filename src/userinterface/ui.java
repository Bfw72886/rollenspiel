package userinterface;

import charakters.*;


public class ui {

    public static void showKaempfersDetailed(Charakter kaempfer1, Charakter kaempfer2) {
        System.out.println(
                kaempfer1 + "\n" +
                kaempfer2);
    }

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
        System.out.println(sieger.getName() + " hat gewonnen!\n");
    }

    public static void heilEvent(Charakter charakter) {
        System.out.println(charakter + " nimmt ein Schluck aus dem Heilbrunnen.\n"
                + charakter + " hat wieder volle Gesundheit.");
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
}
