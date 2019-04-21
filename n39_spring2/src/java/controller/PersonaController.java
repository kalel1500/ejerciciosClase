/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Persona;
import model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
@Controller
public class PersonaController {
    @RequestMapping("index")
    public String indexController(Model model) {
        return "index";
    }
    
    @RequestMapping("segundapagina")
    public String segundaController(Model model) {
        return "segunda";
    }
    
    @RequestMapping("tercerapagina")
    public String terceraController(Model model) {
        return "tercera";
    }
    
    @RequestMapping("cuartapagina")
    public String cuartaController(Model model) {
        return "cuarta";
    }
    
    @RequestMapping("quintapagina")
    public String quintaController(Model model) {
        return "quinta";
    }
    
    @RequestMapping("sextapagina")
    public String sextaController(Model model) {
        //quiero parar el valor 10 del controller a la vista
        String variable = "buenos dias";
        model.addAttribute("miValor",variable);
        return "sexta";
    }
    
    @RequestMapping("septimapagina")
    public ModelAndView septimaController() {
        //ModelAndView modelv = new ModelAndView();
        //modelv.setViewName("septima");
        Persona persona = new Persona();
        persona.setNombre("Adrian");
        persona.setEdad(20);
        
        ModelAndView modelv = new ModelAndView("septima");
        modelv.addObject("persona",persona);
        return modelv;
    }
    
    @RequestMapping(value = "novenapagina", method = RequestMethod.POST)
    public ModelAndView novenaController(HttpServletRequest request, HttpServletResponse response) {
        // crear modelAndView
        ModelAndView modelv = new ModelAndView("novena");
        // recuperar los datos
        String nombre = request.getParameter("nombre");
        
        if (nombre.equals("")) {
            modelv.setViewName("index"); // segunda forma
            return modelv;
        }
        
        int edad;
        try {
            edad = Integer.valueOf(request.getParameter("edad"));
        } catch (Exception e) {
            //response.sendRedirect("redirect.jsp"); // primera forma
            modelv.setViewName("index"); // segunda forma
            return modelv;
        }
        
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        modelv.addObject("persona",persona);
        return modelv;
    }
    
    // recuperar un parametro de una URL sin usar el getparameter
    // decima.htm?nom=10
    @RequestMapping(value = "decimapagina.htm", method = RequestMethod.GET)
    public String decimaController(@RequestParam("nom")String nombre, HttpServletRequest request, Model model) {
//        ModelAndView modelv2 = new ModelAndView("decima");
        Usuario user = new Usuario();
        String nombre1 = request.getParameter("nom");
//        modelv2.addObject("nombreJSP", nombre);
//        modelv2.addObject("nombre1JSP", nombre1);
//        modelv2.addObject("usuario", user);
        model.addAttribute("usuario", user);
//        return modelv2;
        return "index";
    }
    
    @RequestMapping(value = "decimapagina.htm", method = RequestMethod.POST)
    public ModelAndView decimaController(@ModelAttribute("usuario") Usuario usuario) {
        ModelAndView modelv2 = new ModelAndView("informacion");
        modelv2.addObject("datos", usuario);
        return modelv2;
    }
}
