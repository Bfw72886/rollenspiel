public class Monster extends Charakter{
    private int angriffswert;

    public Monster(String name, int gesundheit, int level, boolean imKampf, int angriffswert, int schwierigkeit) {
        super(name, gesundheit, level, imKampf);
        this.angriffswert = angriffswert;
    }

    @Override
    public void angreifen(Charakter gegner) {
        gegner.bekommtSchaden(angriffswert);
    }

    @Override
    public String toString() {
        String generalStats = super.toString();
        String specialStats = String.format("%-15s %d%n", "Angriff:", angriffswert);
        return generalStats + "\n" +
                specialStats;
    }
}
