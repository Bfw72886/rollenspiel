package logic;

import charakters.Monster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBreader {

    public ArrayList<Monster> readMonsters(int difficulty) {
        Connection conn = connect();
        ArrayList<Monster> monsterFromDB = new ArrayList<>();
        var sql = "SELECT * FROM Monster WHERE schwierigkeit = " + difficulty;

        try (var stmt = conn.createStatement();
             var rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                monsterFromDB.add(new Monster(
                        rs.getString("name"),
                        rs.getInt("gesundheit"),
                        rs.getInt("level"),
                        rs.getBoolean("imKampf"),
                        rs.getInt("angriffsWert"),
                        rs.getInt("schwierigkeit")
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
