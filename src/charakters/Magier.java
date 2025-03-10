package charakters;

public class Magier extends Charakter{
    private int intelligenz;
    private int mana;

    public Magier(String name, int gesundheit, int level, boolean imKampf, int intelligenz, int mana) {
        super(name, gesundheit, level, imKampf);
        this.intelligenz = intelligenz;
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligenz() {
        return intelligenz;
    }

    public void setIntelligenz(int intelligenz) {
        this.intelligenz = intelligenz;
    }

    /**
     * When mana is enough, attack with 1.5x damage, otherwise for 1x and regenerate mana
     * @param gegner
     */
    @Override
    public void angreifen(Charakter gegner) {
        if (this.mana > 40) {
            gegner.bekommtSchaden(Math.round(this.intelligenz * 1.5f));
            mana -= 40;
        } else {
            gegner.bekommtSchaden(this.intelligenz);
            mana += 10;
        }
    }

    @Override
    public String toString() {
        String generalStats = super.toString();
        String specialStats = String.format("%-15s %d%n", "Intelligenz:", intelligenz) +
                String.format("%-15s %d", "Mana:", mana);
        return generalStats + "\n" +
                specialStats;
    }
}
