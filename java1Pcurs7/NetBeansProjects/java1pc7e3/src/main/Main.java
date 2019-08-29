/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/java1pc7";
        String username = "root";
        String password = "";
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            
            String sql = "SELECT * FROM persoane";
            
            stmt.execute(sql);
            
            ResultSet result = stmt.getResultSet();
            
            while (result.next()) {
                int id = result.getInt("id");
                String nume = result.getString("nume");
                int varsta = result.getInt("varsta");
                
                System.out.println(id + " " + nume + " " + varsta);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
