package logic;

import charakters.*;
import userinterface.ui;

public class Event {
    Charakter charakter;

    public Event(Charakter charakter) {
        this.charakter = charakter;
    }

    public void heilung() {
        charakter.setGesundheit(charakter.getMaxGesundheit());
        ui.heilEvent(charakter);
    }

    public void items() {
        String klasse = charakter.getClass().getSimpleName();
        switch (klasse) {
            case "Krieger":
                Krieger krieger = (Krieger) charakter;
                int zusatzRuestung = 10;
                krieger.setRuestung(krieger.getRuestung() + zusatzRuestung);
                ui.itemEventKrieger(krieger, zusatzRuestung);
                break;
            case "Magier":
                Magier magier = (Magier) charakter;
                int zusatzMana = 40;
                magier.setMana(magier.getMana() + zusatzMana);
                ui.itemEventMagier(magier, zusatzMana);
                break;
            case "Spaeher":
                Spaeher spaeher = (Spaeher) charakter;
                int zusatzBeweglichkeit = 5;
                spaeher.setBeweglichkeit(spaeher.getBeweglichkeit() + zusatzBeweglichkeit);
                ui.itemEventSpaeher(spaeher, zusatzBeweglichkeit);
                break;
            default:
                System.out.println("Klasse nicht gefunden.");
                break;
        }
    }
}
