public class Magier extends Charakter implements Angreifer{
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
}
