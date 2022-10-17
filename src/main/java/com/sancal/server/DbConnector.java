package com.sancal.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnector {
    private final String url = "jdbc:postgresql://localhost:5432/sancal";
    private final String user = "postgres";
    private final String password = "jsdk6ccp";
    private Connection conn;
    public DbConnector(){
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DbConnector.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnect(){
        return conn;
    }
    
    public void closeConnection(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
