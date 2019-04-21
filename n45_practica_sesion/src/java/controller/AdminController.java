/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Administrador;
import model.Conexion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author Usuario
 */
@Controller
@SessionAttributes({"nom"})
public class AdminController {
    private Conexion con = new Conexion();
    private Connection cn = con.conectar();
    private String sql = "";
    Administrador admin = new Administrador();
    
    @RequestMapping(value="index",method = RequestMethod.GET)  
    public String indexController() {
        return "index";
    }
    
    @RequestMapping(value="login",method = RequestMethod.GET)
    public String loginController(Model model) {
        model.addAttribute("admin", admin);
        return "login";
    }
    
    String nombre;
    String pass;
    @RequestMapping(value="login",method = RequestMethod.POST)
    public String loginController(@ModelAttribute("admin") Administrador admin, Model model) {
        nombre = admin.getNombre_administrador();
        pass = admin.getPassword_administrador();
        sql = "SELECT * FROM `tbl_administrador` WHERE `tbl_administrador`.`nombre_administrador` = '"+nombre+"' AND `tbl_administrador`.`password_administrador` = '"+pass+"'";
        //JOptionPane.showMessageDialog(null, sql);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                model.addAttribute("nom",nombre);
                JOptionPane.showMessageDialog(null, "exito");
                return "exito";
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecos");
                return "login";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido algun error. Vuelve en unos minutos.");
            return "login";
        }
                
    }
    
    @RequestMapping(value="exito",method = RequestMethod.GET)
    public String exitoController(Model model) {
        model.addAttribute("admin", admin);
        return "exito";
    }
    
    @RequestMapping(value="logout",method = RequestMethod.GET)
    public String logoutController(SessionStatus cerrarSesion, Model model) {
        cerrarSesion.setComplete();
        model.addAttribute("admin", admin);
        return "login";
    }
}
