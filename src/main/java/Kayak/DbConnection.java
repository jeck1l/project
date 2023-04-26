package Kayak;

import java.sql.*;

public class DbConnection {

    private Connection conn;

    public DbConnection() {
        String url = "jdbc:postgresql://localhost/seleniumData";
        String user = "postgres";
        String password = "ro26ma56nkA!";
        try {
            conn = DriverManager.getConnection(url, user, password);
            createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//
    private void createTable() {
        String hotelTable = "CREATE TABLE hotels " +
                "(id SERIAL PRIMARY KEY, " +
                "hotel_title VARCHAR(250), " +
                "price INT, " +
                "adress VARCHAR(250))";
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(hotelTable);
            System.out.println("Table created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return conn;
    }

}
