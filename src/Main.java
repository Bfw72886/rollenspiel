import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Charakter> chars = new ArrayList<>();

        chars.add(new Krieger("Gorm", 5, 1, false, 3, 5));
        chars.add(new Magier("Gieswalde", 5, 1, false, 3, 5));
        chars.add(new Spaeher("Lurchi", 5, 1, false, 3, 5));
        chars.add(new Krieger("Gorm2", 5, 1, false, 3, 5));

        System.out.println(chars.get(1).getClass().getSimpleName());

        System.out.println(chars.get(2).getClass().getSimpleName() + " " + chars.get(2).getName() + " läuft.");

        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) instanceof Krieger) {
                ((Krieger) chars.get(i)).getRuestung();
                System.out.println(chars.get(i).getName() + " sagt WAAAAAAAA!!");
            } else if (chars.get(i) instanceof Spaeher) {
                System.out.println(chars.get(i).getName() + " springt verrückt umher.");
            } else {
                System.out.println(chars.get(i).getName() + " macht SON DICKEN FEUERBALL JUNGE.");
            }
        }


    }
}