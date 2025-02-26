public class Spaeher extends Charakter implements Angreifer{

    private int beweglichkeit;
    private int ausdauer;


    public Spaeher(String name, int gesundheit, int level, boolean imKampf, int beweglichkeit, int ausdauer) {
        super(name, gesundheit, level, imKampf);
        this.beweglichkeit = beweglichkeit;
        this.ausdauer = ausdauer;
    }

    public int getBeweglichkeit() {
        return beweglichkeit;
    }

    public void setBeweglichkeit(int beweglichkeit) {
        this.beweglichkeit = beweglichkeit;
    }

    public int getAusdauer() {
        return ausdauer;
    }

    public void setAusdauer(int ausdauer) {
        this.ausdauer = ausdauer;
    }

    @Override
    public void angreifen(Charakter opfer) {
        opfer.bekommtSchaden(this.beweglichkeit);
    }
}
