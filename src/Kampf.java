public class Kampf {
    private Charakter kaempfer1;
    private Charakter kaempfer2;

    public Kampf(Charakter kaempfer1, Charakter kaempfer2) {
        this.kaempfer1 = kaempfer1;
        this.kaempfer2 = kaempfer2;
    }

    public void start() {
        kaempfer1.setImKampf(true);
        kaempfer2.setImKampf(true);

        while (kaempfer1.isImKampf() && kaempfer2.isImKampf()) {
            kaempfer1.angreifen(kaempfer2);
            kaempfer2.angreifen(kaempfer1);
        }

        if (kaempfer1.getGesundheit() == 0 && kaempfer2.getGesundheit() == 0) {
            System.out.println("Gleichstand, beide Kämpfer sind tot.");
        } else if (kaempfer1.getGesundheit() == 0) {
            System.out.println(kaempfer1.getName() + " hat gewonnen!");
        } else {
            System.out.println(kaempfer2.getName() + " hat gewonnen!");
        }
    }

}
