package com.app;

interface DBConnection {
void connect();
}

class MySQLConnection implements DBConnection {
public void connect() { System.out.println("Connecté à MySQL"); }
}

class PostgreSQLConnection implements DBConnection {
public void connect() { System.out.println("Connecté à PostgreSQL"); }
}

abstract class DBFactory {
public abstract DBConnection createConnection();
}

class MySQLFactory extends DBFactory {
public DBConnection createConnection() { return new MySQLConnection(); }
}

class PostgreSQLFactory extends DBFactory {
public DBConnection createConnection() { return new PostgreSQLConnection(); }
}
