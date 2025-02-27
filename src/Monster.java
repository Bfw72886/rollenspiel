public class Monster extends Charakter{
    private int angriffswert;

    public Monster(String name, int gesundheit, int level, boolean imKampf, int angriffswert) {
        super(name, gesundheit, level, imKampf);
        this.angriffswert = angriffswert;
    }

    @Override
    public void angreifen(Charakter gegner) {
        gegner.bekommtSchaden(angriffswert);
    }
}
