package ru.geekbrains.lesson2;

import java.sql.*;

public class CRUD {

    private static Connection connection;
    private static Statement stmt;

    public static void main(String[] args) throws SQLException {
        connect();
        createTable();
        //addIntoTable();
        //updateTable();
        deleteFromTable();
        selectFromTable();
        close();
    }
    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            stmt = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void close() throws SQLException {
        connection.close();
    }
    public static void createTable() throws SQLException {
        stmt.execute("CREATE TABLE IF NOT EXISTS students (StudID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nameSTUD TEXT NOT NULL, scoreSTUD TEXT NOT NULL)");
    }
    public static void addIntoTable() throws SQLException {
        stmt.executeUpdate("INSERT INTO students (StudID, nameSTUD, scoreSTUD) VALUES ('47','Игорь', '40')");
        stmt.executeUpdate("INSERT INTO students (StudID, nameSTUD, scoreSTUD) VALUES ('45','Bob', '40')");
    }
    public static void updateTable() throws SQLException {
        stmt.executeUpdate("UPDATE students SET scoreSTUD = 90 WHERE nameSTUD = 'Игорь'");
    }
    public static void deleteFromTable() throws SQLException {
        stmt.executeUpdate("DELETE FROM students WHERE nameSTUD = 'Bob'");
    }
    public static void selectFromTable() throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE StudID > 2");
        while (rs.next()){
            System.out.println(rs.getString(2) + " " + rs.getString(3));
        }
    }
}
