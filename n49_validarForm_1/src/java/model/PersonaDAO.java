/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.LoginController;
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
public class PersonaDAO {
    private Conexion con = new Conexion();
    private Connection cn = con.conectar(); // Tiene los objetos para conectarnos con la bd
    private String sql = "";
    
    public PersonaDAO() {
    }
    
    // recupera la lista de las personas
    public void getListaPersonas(ArrayList<Persona> listaPersona) {
        sql = "SELECT * FROM tbl_persona";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            listaPersona.clear();
            while(rs.next()) {
                Persona persona = new Persona();
                persona.setId(rs.getInt("id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setPassword(rs.getString("password"));
                persona.setEmail(rs.getString("email"));
                listaPersona.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void eliminarPersona(int id) {
        sql = "DELETE FROM `tbl_persona` WHERE `tbl_persona`.`id` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarPersona(Persona persona) {
        sql = "INSERT INTO `tbl_persona` (`nombre`,`apellido`,`edad`) VALUES(?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre());
            pst.setString(2, persona.getPassword());
            pst.setString(3, persona.getEmail());
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // recupera persona
    public Persona recuperarPersona(int id) {
        Persona persona = new Persona();
        //sql = "SELECT * FROM `tbl_persona` WHERE `tbl_persona`.`id` = ?"; //forma 1
        sql = "SELECT * FROM `tbl_persona` WHERE `tbl_persona`.`id` = "+id; //forma 2
        try {
            //PreparedStatement pst = cn.prepareStatement(sql);//forma 1
            //pst.setInt(1, id); //forma 1
            //int n = pst.executeUpdate();//forma 1
            //persona.setId(n.getString("id")); //forma 1
            //persona.setNombre(n.getString("nombre")); //forma 1
            //persona.setPassword(n.getString("apellido")); //forma 1
            //persona.setEmail(n.getString("edad")); //forma 1
            
            Statement st = cn.createStatement(); //forma 2
            ResultSet rs = st.executeQuery(sql); //forma 2
            rs.next();
            persona.setId(rs.getInt("id")); //forma 2
            persona.setNombre(rs.getString("nombre")); //forma 2
            persona.setPassword(rs.getString("apellido")); //forma 2
            persona.setEmail(rs.getString("edad")); //forma 2
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return persona;
    }
    
    // modifica la persona
    public void modificarPersona(Persona persona) {
        sql = "UPDATE `tbl_persona` SET `nombre` = ?, `apellido` = ?, `edad` = ? WHERE `tbl_persona`.`id` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre());
            pst.setString(2, persona.getPassword());
            pst.setString(3, persona.getEmail());
            pst.setInt(4, persona.getId());
//            JOptionPane.showMessageDialog(null, pst);
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, n);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
