/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.PersonaController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TelefonoDAO {
    private Conexion con = new Conexion();
    private Connection cn = con.conectar(); // Tiene los objetos para conectarnos con la bd
    private String sql = "";
    
    public TelefonoDAO() {
    }
    
    // recupera la lista de las telefonos
    public void getListaTelefonos(ArrayList<Telefono> listaTelefono) {
        sql = "SELECT * FROM tbl_telefono";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            listaTelefono.clear();
            while(rs.next()) {
                Telefono telefono = new Telefono();
                telefono.setId_telefono(rs.getInt("id_telefono"));
                telefono.setNumero_telefono(rs.getString("numero_telefono"));
                telefono.setId_telefono(rs.getInt("id_telefono"));
                listaTelefono.add(telefono);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarTelefono(int id) {
        sql = "DELETE FROM `tbl_telefono` WHERE `tbl_telefono`.`id_telefono` = ?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarTelefono(String telefono, int id_persona) {
        sql = "INSERT INTO `tbl_telefono` (`numero_telefono`,`id_persona`) VALUES(?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, telefono);
            pst.setInt(2, id_persona);
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // recupera telefono
    public Telefono recuperarTelefono(int id) {
        Telefono telefono = new Telefono();
        //sql = "SELECT * FROM `tbl_telefono` WHERE `tbl_telefono`.`id_telefono` = ?"; //forma 1
        sql = "SELECT * FROM `tbl_telefono` WHERE `tbl_telefono`.`id_telefono` = "+id; //forma 2
        try {
            //PreparedStatement pst = cn.prepareStatement(sql);//forma 1
            //pst.setInt(1, id); //forma 1
            //int n = pst.executeUpdate();//forma 1
            //telefono.setId_telefono(n.getString("id_telefono")); //forma 1
            //telefono.setNumero_telefono(n.getString("numero_telefono")); //forma 1
            //telefono.setId_telefono(n.getString("password_telefono")); //forma 1
            //telefono.setEmail_telefono(n.getString("email_telefono")); //forma 1
            
            Statement st = cn.createStatement(); //forma 2
            ResultSet rs = st.executeQuery(sql); //forma 2
            rs.next();
            telefono.setId_telefono(rs.getInt("id_telefono")); //forma 2
            telefono.setNumero_telefono(rs.getString("numero_telefono")); //forma 2
            telefono.setId_persona(rs.getInt("id_persona")); //forma 2
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return telefono;
    }
    
    // modifica la telefono
    public void modificarTelefono(Telefono telefono) {
        sql = "UPDATE `tbl_telefono` SET `numero_telefono` = ?, `id_persona` = ? WHERE `tbl_telefono`.`id_telefono` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, telefono.getNumero_telefono());
            pst.setInt(2, telefono.getId_persona());
            pst.setInt(3, telefono.getId_telefono());
//            JOptionPane.showMessageDialog(null, pst);
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, n);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
