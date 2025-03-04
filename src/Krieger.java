public class Krieger extends Charakter{
    private int staerke;
    private int ruestung;

    public Krieger(String name, int gesundheit, int level, boolean imKampf, int staerke, int ruestung) {
        super(name, gesundheit, level, imKampf);
        this.staerke = staerke;
        this.ruestung = ruestung;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getRuestung() {
        return ruestung;
    }

    public void setRuestung(int ruestung) {
        this.ruestung = ruestung;
    }

    @Override
    public void angreifen(Charakter gegner) {
        gegner.bekommtSchaden(this.staerke);
    }

    @Override
    public void bekommtSchaden(int schaden) {
        // ruestung == percentage of damagereduction
        int schadensVerringerung = Math.round(schaden * ((float) ruestung / 100));
        super.bekommtSchaden(schaden - schadensVerringerung);
    }

    @Override
    public String toString() {
        String generalStats = super.toString();
        return generalStats + "\n" +
                "Stärke: " + staerke + "\n" +
                "Rüstung: " + ruestung;
    }
}
