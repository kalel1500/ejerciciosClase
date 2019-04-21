/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler_operaciones;

import model.OpenSol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @RequestMapping(value = "formulario", method = RequestMethod.GET)
    public ModelAndView formularioController(@RequestParam("op")String op) {
        ModelAndView modelv2 = new ModelAndView("formulario");
        modelv2.addObject("op", op);
        return modelv2;
    }
    
    @RequestMapping(value="resultado",method = RequestMethod.POST)
    public ModelAndView formularioController(@ModelAttribute("opensol") OpenSol opensol) {
        ModelAndView modelv2 = new ModelAndView("resultado");
        modelv2.addObject("opensol",opensol);
        return modelv2;
    }
    
    
}
