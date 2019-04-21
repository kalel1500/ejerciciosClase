/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conexion;
import model.Persona;
import model.PersonaDAO;
import model.TelefonoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("/")
public class PersonaController {
    
    // Creamos la clase PersonaDAO para realizar las conexiones a la bd
    PersonaDAO pdao = new PersonaDAO();
    TelefonoDAO tdao = new TelefonoDAO();
    
    // temporal--
    private Conexion con = new Conexion();
    private Connection cn = con.conectar(); // Tiene los objetos para conectarnos con la bd
    private String sql = "";
    // temporal--
    
    ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    
    @RequestMapping(value="index",method = RequestMethod.GET) // esto es lo mismo: @RequestMapping("index")    
    public String indexController() {
        return "index";
    }
    
    // controlador
    @RequestMapping(value = "listarPersona", method = RequestMethod.GET)
    public String listarPersonaController(Model model) {     
        pdao.getListaPersonas(listaPersona);
        model.addAttribute("listaPersona", listaPersona);
        return "listarPersona";
    }
    
    // controlador
    @RequestMapping(value = "eliminar", method = RequestMethod.GET)
    public RedirectView eliminarPersonaController(@RequestParam("id") int id) {     
        RedirectView respuesta = new RedirectView("listarPersona");
        pdao.eliminarPersona(id);
        return respuesta;
    }
       
    // controlador
    @RequestMapping(value="insertarPersona",method = RequestMethod.GET)
    public String insertarPersonaController(Model model) {
        Persona persona = new Persona();
        model.addAttribute("persona",persona);
        String vista = "insertarPersona";
        return vista;
    }
    
    // controlador
    @RequestMapping(value="insertarPersona",method = RequestMethod.POST)
    public RedirectView insertarPersonaController(@ModelAttribute("persona") Persona persona) {
        RedirectView respuesta = new RedirectView("listarPersona");
        pdao.insertarPersona(persona);
        return respuesta;
    }
    
    // controlador
    @RequestMapping(value = "modificar", method = RequestMethod.GET)
    public String modificarPersonaController(@RequestParam("id") int id, Model model) {     
        Persona persona = pdao.recuperarPersona(id);
        model.addAttribute("persona", persona);
        return "modificarPersona";
    }
    
    // controlador
    @RequestMapping(value="modificarPersona",method = RequestMethod.POST)
    public RedirectView modificarPersonaController(@ModelAttribute("persona") Persona persona) {
        RedirectView respuesta = new RedirectView("listarPersona");
        pdao.modificarPersona(persona);
        return respuesta;
    }
}
