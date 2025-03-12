package charakters;

import userinterface.ui;

import java.util.Scanner;

public class Charakterersteller {
    Scanner scanner;

    public Charakterersteller() {
        scanner = new Scanner(System.in);
    }

    public Charakter createYourCharakter() {
        System.out.println("Wie soll dein Charakter heißen?");
        ui.eingabeAufforderung();
        String name = scanner.nextLine();

        boolean selectionValid = false;
        String selection = "";
        while (!selectionValid) {
            System.out.println(
                    """
                            Wähle deine Klasse:
                            [j] Krieger
                            [k] Magier
                            [l] Späher
                            <Enter> zum Bestätigen"""
            );
            ui.eingabeAufforderung();
            selection = scanner.nextLine();
            if (selection.equals("j") | selection.equals("k") | selection.equals("l")) {
                selectionValid = true;
            }
        }

        return switch (selection) {
            case "j" -> new Krieger(name, 100, 1, false, 20, 20);
            case "k" -> new Magier(name, 100, 1, false, 20, 50);
            case "l" -> new Spaeher(name, 100, 1, false, 20, 20);
            default -> {
                System.out.println("Something went wrong in the Charakter-selection.");
                yield null;
            }
        };

    }

    public Krieger createKrieger() {
        return new Krieger("Keule", 100, 1, false, 20, 20);
    }

    public Magier createMagier() {
        return new Magier("Bimsala", 100, 1, false, 20, 50);
    }

    public Spaeher createSpaeher() {
        return new Spaeher("Augä", 100, 1, false, 20, 20);
    }
}
