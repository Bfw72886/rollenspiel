import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Charakterersteller {
    private ArrayList<Monster> monsters = new ArrayList<>();

    public Charakterersteller() {
        monsters = readMonsters(connect());
    }

    public Krieger createKrieger() {
        return new Krieger("Keule", 100, 1, false, 20, 20);
    }

    public Magier createMagier() {
        return new Magier("Bimsala", 100, 1, false, 20, 50);
    }

    public Spaeher createSpaeher() {
        return new Spaeher("Augä", 100, 1, false, 20, 50);
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    private ArrayList<Monster> readMonsters(Connection conn) {
        ArrayList<Monster> monsterFromDB = new ArrayList<>();
        var sql = "SELECT * FROM Monster";

        try (var stmt = conn.createStatement();
             var rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                monsterFromDB.add(new Monster(
                        rs.getString("name"),
                        rs.getInt("gesundheit"),
                        rs.getInt("level"),
                        rs.getBoolean("imKampf"),
                        rs.getInt("angriffsWert")
                ));
            }
            System.out.println("Arraylist<Monster> successfully read from DB");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return monsterFromDB;
    }

    private Connection connect() {
        var url = "jdbc:sqlite:rollenspieldb.db";

        try {
            var conn = DriverManager.getConnection(url);
            System.out.println("DB connection successful.");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
