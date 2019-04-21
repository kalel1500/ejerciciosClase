/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.validation.Valid;
import model.Persona;
import model.PersonaDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Usuario
 */
@Controller
public class LoginController {
    private ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    PersonaDAO pdao = new PersonaDAO();
    boolean noPasa = true;
    @RequestMapping(value="index",method = RequestMethod.GET)  
    public String indexController(Model model) {
        Persona persona = new Persona();
        model.addAttribute("persona", persona);
        return "index";
    }
    
    @RequestMapping(value="index",method = RequestMethod.POST)
    public String indexController(@Valid @ModelAttribute("persona") Persona persona, BindingResult resultado, Model model) {
        if (resultado.hasErrors() || noPasa == true) {
            return("index");
        } else {
            return("index2");
        }
    }
    
    @RequestMapping("disponibleemail")
    public @ResponseBody String loginDisponible(@RequestParam("email") String email) {
        // recuperar las personas de la bd y añadirlas al arrayList listaPersona
        pdao.getListaPersonas(listaPersona);
        for(Persona a:listaPersona) {
            //JOptionPane.showMessageDialog(null, a.getEmail());
            if (email.equals(a.getEmail())) {
                this.noPasa = true;
                 return "<span style=\"color: red;\">Email no disponible</span";
                 
            }
        }
        noPasa = false;
        //JOptionPane.showMessageDialog(null, noPasa);
        return "Email disponible";
    }
}
