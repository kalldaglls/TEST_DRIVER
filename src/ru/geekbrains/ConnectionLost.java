package ru.geekbrains;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionLost {
    Connection conn = null;
    public static class ConnectionFactory {
        private static Connection conn = null;

        public static Connection getInstance() {
            try {
                conn =
                        DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                                "user=minty&password=greatsqldb");

                // Do something with the Connection

            } catch (SQLException ex) {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            return null;
        }
    }
}
