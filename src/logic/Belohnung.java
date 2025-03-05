package logic;

import charakters.Charakter;
import userinterface.ui;

import java.util.Scanner;

public class Belohnung {
    Charakter charakter;
    Scanner scanner;

    public Belohnung(Charakter charakter) {
        this.charakter = charakter;
        scanner = new Scanner(System.in);
    }

    public void start() {
        ui.belohnungsAuswahl();
        boolean inputValid = false;
        String input = "";

        while (!inputValid) {
            ui.eingabeAufforderung();
            input = scanner.nextLine();
            if (input.equals("j") || input.equals("k") ) {
                inputValid = true;
            }
        }

        switch (input) {
            case "j":
                new Event(charakter).heilung();
                break;
            case "k":
                new Event(charakter).items();
                break;
            default:
                System.out.println("Something went wrong in the rewardselection.");
                break;
        }
    }
}
