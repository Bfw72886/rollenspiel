public class ui {
    private static String symbol = "~ "; // to mark the fighters for better visibility

    public static void showKaempfers(Charakter kaempfer1, Charakter kaempfer2) {
        System.out.println(
                symbol + kaempfer1 + "\n" +
                symbol + kaempfer2 + "\n");
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
