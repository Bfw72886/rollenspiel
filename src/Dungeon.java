import java.util.ArrayList;

public class Dungeon {
    DBreader dbreader;
    ArrayList<Monster> monstersEasy;
    ArrayList<Monster> monstersMedium;
    ArrayList<Monster> monstersHard;
    ArrayList<Monster> bosses;
    Charakter character;

    public Dungeon(Charakter character) {
        dbreader = new DBreader();
        monstersEasy = dbreader.readMonsters(1);
        monstersMedium = dbreader.readMonsters(2);
        monstersHard = dbreader.readMonsters(3);
        bosses = dbreader.readMonsters(4);
        this.character = character;
    }

    public void start() {
        for (int i = 1; i <= 10; i++) {
            ui.showKampf(i);
            if (i < 4) {
                new Kampf(character, getRandomMonster(monstersEasy)).start();
            } else if (i < 8) {
                new Kampf(character, getRandomMonster(monstersMedium)).start();
            } else if (i < 10) {
                new Kampf(character, getRandomMonster(monstersHard)).start();
            } else {
                new Kampf(character, getRandomMonster(bosses)).start();
            }
        }
    }

    private Monster getRandomMonster(ArrayList<Monster> monsters) {
        int randomIndex = (int) (Math.random() * monsters.size());
        return monsters.get(randomIndex);
    }
}
