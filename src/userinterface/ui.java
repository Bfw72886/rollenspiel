package userinterface;

import charakters.Charakter;

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
}
