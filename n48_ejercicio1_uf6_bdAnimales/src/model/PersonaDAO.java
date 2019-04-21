/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
        sql = "SELECT * FROM tbl_animal";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            listaPersona.clear();
            while(rs.next()) {
                Persona persona = new Persona();
                persona.setId_animal(rs.getInt("id_animal"));
                persona.setNombre_animal(rs.getString("nombre_animal"));
                persona.setRaza_animal(rs.getString("raza_animal"));
                persona.setEdad_animal(rs.getInt("edad_animal"));
                listaPersona.add(persona);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void eliminarPersona(int id) {
        sql = "DELETE FROM `tbl_animal` WHERE `tbl_animal`.`id_animal` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void insertarPersona(Persona persona) {
        sql = "INSERT INTO `tbl_animal` (`nombre_animal`,`raza_animal`,`edad_animal`) VALUES(?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre_animal());
            pst.setString(2, persona.getRaza_animal());
            pst.setInt(3, persona.getEdad_animal());
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    // recupera persona
    public Persona recuperarPersona(int id) {
        Persona persona = new Persona();
        //sql = "SELECT * FROM `tbl_animal` WHERE `tbl_animal`.`id_animal` = ?"; //forma 1
        sql = "SELECT * FROM `tbl_animal` WHERE `tbl_animal`.`id_animal` = "+id; //forma 2
        try {
            //PreparedStatement pst = cn.prepareStatement(sql);//forma 1
            //pst.setInt(1, id); //forma 1
            //int n = pst.executeUpdate();//forma 1
            //persona.setId_animal(n.getString("id_animal")); //forma 1
            //persona.setNombre_animal(n.getString("nombre_animal")); //forma 1
            //persona.setRaza_animal(n.getString("raza_animal")); //forma 1
            //persona.setEdad_animal(n.getString("edad_animal")); //forma 1
            
            Statement st = cn.createStatement(); //forma 2
            ResultSet rs = st.executeQuery(sql); //forma 2
            rs.next();
            persona.setId_animal(rs.getInt("id_animal")); //forma 2
            persona.setNombre_animal(rs.getString("nombre_animal")); //forma 2
            persona.setRaza_animal(rs.getString("raza_animal")); //forma 2
            persona.setEdad_animal(rs.getInt("edad_animal")); //forma 2
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return persona;
    }
    
    // modifica la persona
    public void modificarPersona(Persona persona) {
        sql = "UPDATE `tbl_animal` SET `nombre_animal` = ?, `raza_animal` = ?, `edad_animal` = ? WHERE `tbl_animal`.`id_animal` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre_animal());
            pst.setString(2, persona.getRaza_animal());
            pst.setInt(3, persona.getEdad_animal());
            pst.setInt(4, persona.getId_animal());
//            JOptionPane.showMessageDialog(null, pst);
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, n);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
