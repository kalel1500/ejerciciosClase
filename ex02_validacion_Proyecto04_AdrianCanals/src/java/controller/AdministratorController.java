/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.validation.Valid;
import model.Administrador;
import model.AdministradorDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Administrador
 */
@Controller
@RequestMapping("/")
@SessionAttributes({"us"})
public class AdministratorController {
    
    // Administrador
    AdministradorDAO adao = new AdministradorDAO();
    Administrador admin = new Administrador();
    Administrador administrador = new Administrador();
    ArrayList<Administrador> listaAdministrador = new ArrayList<Administrador>();
    
    boolean noPasa = true;
    
    // index
    @RequestMapping(value = "index", method = RequestMethod.GET) // esto es lo mismo: @RequestMapping("index")    
    public String indexController(Model model) {
        model.addAttribute("title", "Inicio");
        return "index";
    }
    
    // login
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginController(Model model) {
        admin = new Administrador();
        model.addAttribute("admin", admin);
        model.addAttribute("title", "Login");
        return "login";
    }
    
    // login
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginController(@Valid @ModelAttribute("admin") Administrador admin, BindingResult resultado, Model model) {
        if (resultado.hasErrors()) {
            model.addAttribute("admin", admin);
            model.addAttribute("title", "Login");
            return "login";
        } else {
            String pasa = adao.loginAdministrador(admin);
            if (pasa.equals("correcto")) {
                model.addAttribute("us", admin);
                //JOptionPane.showMessageDialog(null, "exito");
                model.addAttribute("title", "Exito");
                return "exito";
            } else if (pasa.equals("incorrecto")) {
                model.addAttribute("msgLogin", "incorrecto");
                model.addAttribute("title", "Login");
                return "login";
            } else {
                JOptionPane.showMessageDialog(null, "Ha habido algun error. Vuelve en unos minutos.");
                model.addAttribute("title", "Login");
                return "login";
            }
        }
            
    }

    // exito
    @RequestMapping(value = "exito", method = RequestMethod.GET)
    public String exitoController(Model model) {
        model.addAttribute("admin", admin);
        model.addAttribute("title", "Exito");
        return "exito";
    }
    
    // logout
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logoutController(SessionStatus cerrarSesion, Model model) {
        cerrarSesion.setComplete();
        model.addAttribute("admin", admin);
        model.addAttribute("title", "Inicio");
        return "index";
    }
    
    @RequestMapping("disponibleemail")
    public @ResponseBody String loginDisponible(@RequestParam("admin_correo") String email) {
        // recuperar las personas de la bd y añadirlas al arrayList listaPersona
        adao.getListaAdministradores(listaAdministrador);
        for(Administrador a:listaAdministrador) {
            //JOptionPane.showMessageDialog(null, a.getEmail());
            if (email.equals(a.getAdmin_correo())) {
                this.noPasa = true;
                 return "<span style=\"color: red;\">Email no disponible</span";
                 
            }
        }
        noPasa = false;
        //JOptionPane.showMessageDialog(null, noPasa);
        return "Email disponible";
    }
    
    
    // --------------------------------USUARIOS--------------------------------
    // ------funciones series---------------
    public void funcionListarUsu(Model model) {
        adao.getListaAdministradores(listaAdministrador);
        model.addAttribute("listaAdministrador", listaAdministrador);
        model.addAttribute("title", "Administradores");
    }
    public void funcionInsertarUsu(Model model, Administrador administrador) {
        // enviamos la serie para el form
        model.addAttribute("administrador", administrador);
        // enviamos el titulo head
        model.addAttribute("title", "Insertar administradores");
    }
    public void funcionModificarUsu(Model model, Administrador administrador) {
        // enviamos la serie para el formulario
        model.addAttribute("administrador", administrador);
        // enviamos el titulo para el head
        model.addAttribute("title", "Modificar administrador");
    }
    // ------fin-funciones series---------------

    // Mostrar administradores
    @RequestMapping(value = "listarAdministrador", method = RequestMethod.GET)
    public String listarAdministradorController(Model model) {
        funcionListarUsu(model);
        return "listarAdministrador";
    }

    // Eliminar administradores
    @RequestMapping(value = "eliminarAdministrador", method = RequestMethod.GET)
    public RedirectView eliminarAdministradorController(@RequestParam("id") int id) {
        RedirectView respuesta = new RedirectView("listarAdministrador");
        adao.eliminarAdministrador(id);
        return respuesta;
    }

    // Insertar administradores
    @RequestMapping(value = "insertarAdministrador", method = RequestMethod.GET)
    public String insertarAdministradorController(Model model) {
        administrador = new Administrador();
        funcionInsertarUsu(model, administrador);
        return "insertarAdministrador";
    }

    // Insertar administradores
    @RequestMapping(value = "insertarAdministrador", method = RequestMethod.POST)
    public String insertarAdministradorController(@Valid @ModelAttribute("administrador") Administrador administrador, BindingResult resultado, Model model) {
        if (resultado.hasErrors()) {
            funcionInsertarUsu(model, administrador);
            return "insertarAdministrador";
        } else {
            adao.insertarAdministrador(administrador);
            funcionListarUsu(model);
            return "listarAdministrador";
        }
    }

    // Modificar administradores
    @RequestMapping(value = "modificarAdministrador", method = RequestMethod.GET)
    public String modificarAdministradorController(@RequestParam("id") int id, Model model) {
        administrador = adao.recuperarAdministrador(id);
        funcionModificarUsu(model, administrador);
        return "modificarAdministrador";
    }
    
    // Modificar administradores
    @RequestMapping(value = "modificarAdministrador", method = RequestMethod.POST)
    public String modificarAdministradorController(@Valid @ModelAttribute("administrador") Administrador administrador, BindingResult resultado, Model model) {
        if (resultado.hasErrors()) {
            funcionModificarUsu(model, administrador);
            return "modificarAdministrador";
        } else {
            adao.modificarAdministrador(administrador);
            funcionListarUsu(model);
            return "listarAdministrador";
        }
    }
}
