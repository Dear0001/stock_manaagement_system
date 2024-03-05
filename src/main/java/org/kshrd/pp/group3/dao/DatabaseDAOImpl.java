package org.kshrd.pp.group3.dao;

import org.kshrd.pp.group3.models.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDAOImpl implements DatabaseDAO {

    private static DatabaseDAOImpl instance;

    @Override
    public Connection getConnect() throws SQLException {
        return DriverManager.getConnection(Database.getUrl(),
                Database.getUsername(),
                Database.getPassword());
    }
}
