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
        for (int i = 0; i < 3; i++) {
            new Kampf(character, getRandomMonster(monstersEasy)).start();
        }

        for (int i = 0; i < 3; i++) {
            new Kampf(character, getRandomMonster(monstersMedium)).start();
        }

        for (int i = 0; i < 3; i++) {
            new Kampf(character, getRandomMonster(monstersHard)).start();
        }

        new Kampf(character, getRandomMonster(bosses)).start();
    }

    private Monster getRandomMonster(ArrayList<Monster> monsters) {
        int randomIndex = (int) (Math.random() * monsters.size());
        return monsters.get(randomIndex);
    }
}
