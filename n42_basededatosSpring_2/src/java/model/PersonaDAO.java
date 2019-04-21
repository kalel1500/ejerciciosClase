/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.BaseController;
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
                persona.setId_persona(rs.getInt("id_persona"));
                persona.setNombre_persona(rs.getString("nombre_persona"));
                persona.setApellido_persona(rs.getString("apellido_persona"));
                persona.setEdad_persona(rs.getInt("edad_persona"));
                listaPersona.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona(int id) {
        sql = "DELETE FROM `tbl_persona` WHERE `tbl_persona`.`id_persona` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarPersona(Persona persona) {
        sql = "INSERT INTO `tbl_persona` (`nombre_persona`,`apellido_persona`,`edad_persona`) VALUES(?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre_persona());
            pst.setString(2, persona.getApellido_persona());
            pst.setInt(3, persona.getEdad_persona());
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // recupera persona
    public Persona recuperarPersona(int id) {
        Persona persona = new Persona();
        //sql = "SELECT * FROM `tbl_persona` WHERE `tbl_persona`.`id_persona` = ?"; //forma 1
        sql = "SELECT * FROM `tbl_persona` WHERE `tbl_persona`.`id_persona` = "+id; //forma 2
        try {
            //PreparedStatement pst = cn.prepareStatement(sql);//forma 1
            //pst.setInt(1, id); //forma 1
            //int n = pst.executeUpdate();//forma 1
            //persona.setId_persona(n.getString("id_persona")); //forma 1
            //persona.setNombre_persona(n.getString("nombre_persona")); //forma 1
            //persona.setApellido_persona(n.getString("apellido_persona")); //forma 1
            //persona.setEdad_persona(n.getString("edad_persona")); //forma 1
            
            Statement st = cn.createStatement(); //forma 2
            ResultSet rs = st.executeQuery(sql); //forma 2
            rs.next();
            persona.setId_persona(rs.getInt("id_persona")); //forma 2
            persona.setNombre_persona(rs.getString("nombre_persona")); //forma 2
            persona.setApellido_persona(rs.getString("apellido_persona")); //forma 2
            persona.setEdad_persona(rs.getInt("edad_persona")); //forma 2
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return persona;
    }
    
    // modifica la persona
    public void modificarPersona(Persona persona) {
        sql = "UPDATE `tbl_persona` SET `nombre_persona` = ?, `apellido_persona` = ?, `edad_persona` = ? WHERE `tbl_persona`.`id_persona` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre_persona());
            pst.setString(2, persona.getApellido_persona());
            pst.setInt(3, persona.getEdad_persona());
            pst.setInt(4, persona.getId_persona());
//            JOptionPane.showMessageDialog(null, pst);
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, n);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(BaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
