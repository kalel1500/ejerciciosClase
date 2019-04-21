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
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId_persona(rs.getInt("id_persona"));
                persona.setNombre_persona(rs.getString("nombre_persona"));
                persona.setPassword_persona(rs.getString("password_persona"));
                persona.setEmail_persona(rs.getString("email_persona"));
                listaPersona.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPersona(int id) {
        sql = "DELETE FROM `tbl_persona` WHERE `tbl_persona`.`id_persona` = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertarPersona(Persona persona) {
        sql = "INSERT INTO `tbl_persona` (`nombre_persona`,`password_persona`,`email_persona`) VALUES(?,?,?)";
        try {
            cn.setAutoCommit(false);
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre_persona());
            pst.setString(2, persona.getPassword_persona());
            pst.setString(3, persona.getEmail_persona());
            int n = pst.executeUpdate();

            sql = "SELECT DISTINCT last_insert_id() FROM tbl_persona";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            int id_persona = rs.getInt("last_insert_id()");
            JOptionPane.showMessageDialog(null, id_persona);
            sql = "INSERT INTO `tbl_telefono` (`numero_telefono`,`id_persona`) VALUES(?,?)";
            try {
                pst = cn.prepareStatement(sql);
                pst.setString(1, persona.getNumero_telefono1());
                pst.setInt(2, id_persona);
                n = pst.executeUpdate();
                
                pst.setString(1, persona.getNumero_telefono2());
                pst.setInt(2, id_persona);
                n = pst.executeUpdate();
                
                pst.setString(1, persona.getNumero_telefono3());
                pst.setInt(2, id_persona);
                n = pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            cn.commit();
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // recupera persona
    public Persona recuperarPersona(int id) {
        Persona persona = new Persona();
        sql = "SELECT * FROM `tbl_persona` WHERE `tbl_persona`.`id_persona` = " + id;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            persona.setId_persona(rs.getInt("id_persona"));
            persona.setNombre_persona(rs.getString("nombre_persona"));
            persona.setPassword_persona(rs.getString("password_persona"));
            persona.setEmail_persona(rs.getString("email_persona"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return persona;
    }

    // modifica la persona
    public void modificarPersona(Persona persona) {
        sql = "UPDATE `tbl_persona` SET `nombre_persona` = ?, `password_persona` = ?, `email_persona` = ? WHERE `tbl_persona`.`id_persona` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre_persona());
            pst.setString(2, persona.getPassword_persona());
            pst.setString(3, persona.getEmail_persona());
            pst.setInt(4, persona.getId_persona());
//            JOptionPane.showMessageDialog(null, pst);
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, n);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(PersonaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
