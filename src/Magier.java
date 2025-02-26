public class Magier extends Charakter implements Angreifer{
    private int mana;
    private int intelligenz;

    public Magier(String name, int gesundheit, int level, boolean imKampf, int mana, int intelligenz) {
        super(name, gesundheit, level, imKampf);
        this.mana = mana;
        this.intelligenz = intelligenz;
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
        gegner.bekommtSchaden(this.intelligenz);
    }
}
