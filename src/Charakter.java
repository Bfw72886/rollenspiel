public class Charakter {
    private String name;
    private int gesundheit;
    private int level;
    private boolean imKampf;

    public Charakter(String name, int gesundheit, int level, boolean imKampf) {
        this.name = name;
        this.gesundheit = gesundheit;
        this.level = level;
        this.imKampf = imKampf;
    }

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
}
