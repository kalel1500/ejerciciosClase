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
 * @author Administrador
 */
public class AdministradorDAO {
    
    private Conexion con = new Conexion();
    private Connection cn = con.conectar(); // Tiene los objetos para conectarnos con la bd
    private String sql = "";

    public AdministradorDAO() {
    }
    
    // login administrador
    public String loginAdministrador(Administrador administrador) {
        String email = administrador.getAdmin_correo();
        String pass = administrador.getAdmin_password();
        sql = "SELECT * FROM `tbl_administrador` WHERE `tbl_administrador`.`admin_correo` = '" + email + "' AND `tbl_administrador`.`admin_password` = '" + pass + "'";
        
        //JOptionPane.showMessageDialog(null, sql);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                //JOptionPane.showMessageDialog(null, "exito");
                administrador.setAdmin_id(rs.getInt("admin_id"));
                administrador.setAdmin_edad(rs.getInt("admin_edad"));
                return "correcto";
            } else {
                //JOptionPane.showMessageDialog(null, "Administrador o contraseña incorrecos");
                return "incorrecto";
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Ha habido algun error. Vuelve en unos minutos.");
            return "error";
        }
    }
    
    // recupera la lista de las administradors
    public void getListaAdministradores(ArrayList<Administrador> listaAdministrador) {
        sql = "SELECT * FROM tbl_administrador";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            listaAdministrador.clear();
            while (rs.next()) {
                Administrador administrador = new Administrador();
                administrador.setAdmin_id(rs.getInt("admin_id"));
                administrador.setAdmin_edad(rs.getInt("admin_edad"));
                administrador.setAdmin_password(rs.getString("admin_password"));
                administrador.setAdmin_correo(rs.getString("admin_correo"));
                listaAdministrador.add(administrador);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarAdministrador(int id) {
        sql = "DELETE FROM `tbl_administrador` WHERE `tbl_administrador`.`admin_id` = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            int n = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertarAdministrador(Administrador administrador) {
        sql = "INSERT INTO `tbl_administrador` (`admin_edad`,`admin_password`,`admin_correo`) VALUES(?,?,?)";
        try {
            cn.setAutoCommit(false);
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, administrador.getAdmin_edad());
            pst.setString(2, administrador.getAdmin_password());
            pst.setString(3, administrador.getAdmin_correo());
            int n = pst.executeUpdate();
            
            cn.commit();
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // recupera administrador
    public Administrador recuperarAdministrador(int id) {
        Administrador administrador = new Administrador();
        sql = "SELECT * FROM `tbl_administrador` WHERE `tbl_administrador`.`admin_id` = " + id;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            administrador.setAdmin_id(rs.getInt("admin_id"));
            administrador.setAdmin_edad(rs.getInt("admin_edad"));
            administrador.setAdmin_password(rs.getString("admin_password"));
            administrador.setAdmin_correo(rs.getString("admin_correo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return administrador;
    }

    // modifica la administrador
    public void modificarAdministrador(Administrador administrador) {
        sql = "UPDATE `tbl_administrador` SET `admin_edad` = ?, `admin_password` = ?, `admin_correo` = ? WHERE `tbl_administrador`.`admin_id` = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, administrador.getAdmin_edad());
            pst.setString(2, administrador.getAdmin_password());
            pst.setString(3, administrador.getAdmin_correo());
            pst.setInt(4, administrador.getAdmin_id());
//            JOptionPane.showMessageDialog(null, pst);
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, n);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
