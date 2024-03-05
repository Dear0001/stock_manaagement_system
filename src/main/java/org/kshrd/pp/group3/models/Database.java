package org.kshrd.pp.group3.models;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/stock_management_system_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "123456";

    public static String getUrl() {
        return URL;
    }

    public static String getUsername() {
        return USERNAME;
    }

    public static String getPassword() {
        return PASSWORD;
    }
}
