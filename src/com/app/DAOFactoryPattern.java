package com.app;

interface UserDAO { void save(); }
interface ProductDAO { void save(); }

class MySQLUserDAO implements UserDAO {
public void save() { System.out.println("User sauvegardé MySQL"); }
}
class MySQLProductDAO implements ProductDAO {
public void save() { System.out.println("Product sauvegardé MySQL"); }
}

class PostgreSQLUserDAO implements UserDAO {
public void save() { System.out.println("User sauvegardé PostgreSQL"); }
}
class PostgreSQLProductDAO implements ProductDAO {
public void save() { System.out.println("Product sauvegardé PostgreSQL"); }
}

interface DAOFactory {
UserDAO createUserDAO();
ProductDAO createProductDAO();
}

class MySQLDAOFactory implements DAOFactory {
public UserDAO createUserDAO() { return new MySQLUserDAO(); }
public ProductDAO createProductDAO() { return new MySQLProductDAO(); }
}

class PostgreSQLDAOFactory implements DAOFactory {
public UserDAO createUserDAO() { return new PostgreSQLUserDAO(); }
public ProductDAO createProductDAO() { return new PostgreSQLProductDAO(); }
}
