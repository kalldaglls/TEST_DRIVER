package ru.geekbrains;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import com.mysql.DriverManager;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Dr");
        Class.forName("com.mysql.jdbc.Connection");
        DriverManager.registerDriver(new Driver());
        Connection connection = new DriverManager();



    }
}
