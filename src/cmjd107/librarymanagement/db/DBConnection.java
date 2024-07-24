/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DBConnection {

    private static DBConnection dbConnnection;

    private Connection connection;

    private DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "19960709");
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if (dbConnnection == null) {
            dbConnnection = new DBConnection();
        }

        return dbConnnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
