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
        // chance to crit == 25% of beweglichkeit
        int critDiceRoll = (int) (Math.random() * 100 + 1); // 1-100
        critDiceRoll = Math.round(critDiceRoll / 4.0f); // 0-25
        boolean isCrit = critDiceRoll <= beweglichkeit;
        // TODO attack-miss-chance

        if (!isCrit) {
            gegner.bekommtSchaden(this.beweglichkeit);
        } else {
            gegner.bekommtSchaden(this.beweglichkeit * 2);
        }
    }

    @Override
    public void bekommtSchaden(int schaden) {
        if (!hasDodged()) {
            super.bekommtSchaden(schaden);
        }
    }

    /**
     * ausdauer == percentage of dodgechance
     * @return true if dodgechance was sufficient
     */
    private boolean hasDodged() {
        int dodgeDiceRoll = (int) (Math.random() * 100 + 1); // 1-100
        return dodgeDiceRoll <= ausdauer;
    }
}
