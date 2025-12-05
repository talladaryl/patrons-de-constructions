package com.app;

public class Main {
    public static void main(String[] args) {
        // Singleton
        SingletonDB db = SingletonDB.getInstance();
        db.getConnection();

        // Builder
        User u1 = new User.Builder().setNom("Alice").setEmail("alice@mail.com").setPassword("1234").build();
        u1.afficher();

        // Factory simple
        User u2 = UserFactory.createUser("Bob", "bob@mail.com", "5678");
        u2.afficher();

        // Factory Method
        DBFactory f1 = new MySQLFactory();
        DBConnection c1 = f1.createConnection();
        c1.connect();

        DBFactory f2 = new PostgreSQLFactory();
        DBConnection c2 = f2.createConnection();
        c2.connect();

        // Abstract Factory
        DAOFactory daoF = new MySQLDAOFactory();
        UserDAO userDAO = daoF.createUserDAO();
        ProductDAO productDAO = daoF.createProductDAO();
        userDAO.save();
        productDAO.save();
    }
}

