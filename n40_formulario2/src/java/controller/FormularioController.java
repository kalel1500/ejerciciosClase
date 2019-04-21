/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("/")
public class FormularioController {
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String indexController() {
        return "index";
    }
    @RequestMapping(value="formulario",method = RequestMethod.GET)
    public String formularioController(Model model) {
        Persona persona = new Persona("Adrian",20);
        model.addAttribute("persona",persona);
        return "formulario";
    }
    
    @RequestMapping(value="presentacion",method = RequestMethod.POST)
    public ModelAndView formularioController(@ModelAttribute("persona") Persona persona) {
        ModelAndView modelv2 = new ModelAndView("presentacion");
        modelv2.addObject("persona",persona);
        return modelv2;
    }
}
