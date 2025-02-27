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
    public void angreifen(Charakter gegner) {
        gegner.bekommtSchaden(this.beweglichkeit);
    }

    @Override
    public void bekommtSchaden(int schaden) {
        // ausdauer == percentage of dodgechance
        int dodgeDiceRoll = (int) (Math.random() * 100 + 1);
        if (dodgeDiceRoll > ausdauer) {
            super.bekommtSchaden(schaden);
        }
    }
}
