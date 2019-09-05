/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AngajatDAO;
import dao.DepartamentDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Angajat;
import model.Departament;

/**
 *
 * @author student
 */
public class MainController {
    private DepartamentDAO departamentDao;
    private AngajatDAO angajatDao;
    
    private MainController() {
        String url = "jdbc:mysql://localhost:3306/java1pc8";
        
        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            departamentDao = new DepartamentDAO(con);
            angajatDao = new AngajatDAO(con);
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MainController getInstance() {
        return MainControllerHolder.INSTANCE;
    }
    
    private static class MainControllerHolder {

        private static final MainController INSTANCE = new MainController();
    }
    
    public boolean adaugaDepartament(Departament d) {
        return departamentDao.create(d);
    }
    
    public List<Departament> getDepartamente() {
        return departamentDao.findAll();
    }
    
    public boolean adaugaAngajat(Angajat a) {
        return angajatDao.create(a);
    }
    
    public List<Angajat> getAngajati(int departamentId) {
        return angajatDao.findByDepartamentId(departamentId);
    }
    
    public boolean removeAngajat(Angajat a) {
        return angajatDao.remove(a.getId());
    }
}
