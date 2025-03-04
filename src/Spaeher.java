public class Spaeher extends Charakter{

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
        if (hasMissed()) {

        } else if (!isCrit()) {
            gegner.bekommtSchaden(this.beweglichkeit);
        } else {
            gegner.bekommtSchaden(this.beweglichkeit * 2);
        }
    }

    /**
     * chance to crit == 25% of beweglichkeit
     * @return true if critchance was sufficient
     */
    private boolean isCrit() {
        int critDiceRoll = rollD100();
        critDiceRoll = Math.round(critDiceRoll / 4.0f); // 0-25
        return critDiceRoll <= beweglichkeit;
    }

    /**
     * chance to miss == 10%
     * @return true if missChance was sufficient
     */
    private boolean hasMissed() {
        int missDiceRoll = rollD100();
        return missDiceRoll <= 10;
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
        int dodgeDiceRoll = rollD100();
        return dodgeDiceRoll <= ausdauer;
    }

    /**
     * reference to boardgame dnd
     * @return 1-100 (randomly)
     */
    private int rollD100() {
        return (int) (Math.random() * 100 + 1);
    }

    @Override
    public String toString() {
        String generalStats = super.toString();
        return generalStats + "\n" +
                "Beweglichkeit: " + beweglichkeit + "\n" +
                "Ausdauer: " + ausdauer;
    }
}
