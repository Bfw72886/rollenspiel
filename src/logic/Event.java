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

    /**
     * Gives reward specific to class of Charakter
     */
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

    /**
     * NOT INTEGRATED YET
     * Charakter either has enough {@code percentageHealthNeededForSacrifice} and pays or not
     * @see Event#devilDealGranted()
     * @see Event#devilDealRefused()
     */
    public void devilDealTry() {
        int percentageHealthNeededForSacrifice = 20;
        int healthSacrifice = Math.round(charakter.getMaxGesundheit() * (percentageHealthNeededForSacrifice / 100f));
        boolean hasEnoughHealth = charakter.getGesundheit() > healthSacrifice;

        if (hasEnoughHealth) {
            charakter.setGesundheit(charakter.getGesundheit() - healthSacrifice);
            devilDealGranted();
        } else {
            devilDealRefused();
        }
    }

    private void devilDealGranted() {
        ui.devilDealGranted();
        // TODO Randomness for 3 events, 2 positive, 1 neutral
    }

    private void devilDealRefused() {
        ui.devilDealRefused();
        // TODO Randomness for 3 events, 1 positive, 2 negative
    }
}
