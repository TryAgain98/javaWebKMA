/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Huy Toan
 */
public class Connector {
    public Connection getDB() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/kma?characterEncoding=UTF-8";
        Connection conn = DriverManager.getConnection(connStr, "root", "anhtoan");
        return conn;
    }
}
