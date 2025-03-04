import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBreader {
    ArrayList<Monster> monsters;

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public DBreader() {
        monsters = readMonsters(connect());
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
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
