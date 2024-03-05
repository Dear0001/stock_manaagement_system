package org.kshrd.pp.group3.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseDAO {
    Connection getConnect() throws SQLException;
}
