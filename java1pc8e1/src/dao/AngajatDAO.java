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
import model.Angajat;

/**
 *
 * @author student
 */
public class AngajatDAO {
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private PreparedStatement stmt3;

    public AngajatDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement("INSERT INTO angajati VALUES (null, ?, ?, ?)");
            stmt2 = con.prepareStatement("SELECT * FROM angajati WHERE departament_id = ?");
            stmt3 = con.prepareStatement("DELETE FROM angajati WHERE id = ?");
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean create(Angajat a) {
        try {
            stmt1.setString(1, a.getNume());
            stmt1.setInt(2, a.getVarsta());
            stmt1.setInt(3, a.getDepartamentId());
            
            return stmt1.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Angajat> findByDepartamentId(int departamentId) {
        try {
            stmt2.setInt(1, departamentId);
            
            ResultSet rs = stmt2.executeQuery();
            
            List<Angajat> list = new ArrayList<>();
            
            while (rs.next()) {
                Angajat a = new Angajat(
                        rs.getInt("id"),
                        rs.getString("nume"),
                        rs.getInt("varsta"),
                        rs.getInt("departament_id")
                );
                
                list.add(a);
            }
            
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }
    
    public boolean remove(int angajatId) {
        try {
            stmt3.setInt(1, angajatId);
            
            return stmt3.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
