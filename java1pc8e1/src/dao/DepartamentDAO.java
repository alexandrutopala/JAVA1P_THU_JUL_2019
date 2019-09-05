/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Departament;

/**
 *
 * @author student
 */
public class DepartamentDAO {
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;

    public DepartamentDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement("INSERT INTO departamente VALUES (null, ?)");
            stmt2 = con.prepareStatement("SELECT * FROM departamente");
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean create(Departament d) {
        try {
            stmt1.setString(1, d.getNume());
            
            return stmt1.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Departament> findAll() {
        try (ResultSet rs = stmt2.executeQuery()) {
            List<Departament> list = new ArrayList<>();
            
            while (rs.next()) {
                Departament d = new Departament(
                        rs.getInt("id"),
                        rs.getString("nume")
                );
                list.add(d);
            }
            
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }
}
