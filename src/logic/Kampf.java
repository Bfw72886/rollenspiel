package logic;

import charakters.Charakter;
import userinterface.ui;

public class Kampf {
    private Charakter kaempfer1;
    private Charakter kaempfer2;

    public Kampf(Charakter kaempfer1, Charakter kaempfer2) {
        this.kaempfer1 = kaempfer1;
        this.kaempfer2 = kaempfer2;
    }

    /**
     * Both kaempfers battle until the first one has no gesundheit
     */
    public void start() {
        kaempfer1.setImKampf(true);
        kaempfer2.setImKampf(true);

        ui.showKaempfersDetailed(kaempfer1, kaempfer2);

        while (kaempfer1.isImKampf() && kaempfer2.isImKampf()) {
            kaempfer1.angreifen(kaempfer2);
            kaempfer2.angreifen(kaempfer1);
            ui.showKaempfers(kaempfer1, kaempfer2);
        }

        if (kaempfer1.getGesundheit() == 0 && kaempfer2.getGesundheit() == 0) {
            ui.showSiegerGleichstand();
        } else if (kaempfer1.getGesundheit() == 0) {
            ui.showSieger(kaempfer2);
            kaempfer2.setImKampf(false);
        } else {
            ui.showSieger(kaempfer1);
            kaempfer1.setImKampf(false);
        }
    }

}
