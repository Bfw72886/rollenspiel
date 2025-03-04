public abstract class Charakter {
    private String name;
    private final int maxGesundheit;
    private int gesundheit;
    private int level;
    private boolean imKampf;

    public Charakter(String name, int gesundheit, int level, boolean imKampf) {
        this.name = name;
        this.gesundheit = gesundheit;
        this.level = level;
        this.imKampf = imKampf;
        this.maxGesundheit = gesundheit;
    }

    public void bekommtSchaden(int schaden) {
        gesundheit -= schaden;
        if (gesundheit <= 0) {
            gesundheit = 0;
            this.imKampf = false;
        }
    }

    public abstract void angreifen(Charakter gegner);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isImKampf() {
        return imKampf;
    }

    public void setImKampf(boolean imKampf) {
        this.imKampf = imKampf;
    }

    public String getNameAndGesundheit() {
        return String.format("%-15s %d / %d", name, gesundheit, maxGesundheit);
    }

    @Override
    public String toString() {
        return String.format("%-15s %d / %d", name, gesundheit, maxGesundheit);
    }
}
