package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class SingletonDB {
    private static SingletonDB instance;
    private Connection connection;

    private SingletonDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/TP_INF461_DP";
            String user = "root";
            String password = "";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion établie !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized SingletonDB getInstance() {
        if (instance == null) {
            instance = new SingletonDB();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
