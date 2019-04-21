/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler_operaciones;

import javax.swing.JOptionPane;
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
public class OperacionController {
    
    @RequestMapping(value="index",method = RequestMethod.GET)
    // @RequestMapping("index") // es lo mismo
    public String indexController() {
        return "index";
    }
    
//    Suma----------------------------------------------------------------------
    @RequestMapping(value = "suma", method = RequestMethod.GET)
    public String sumaController(Model model) {     // relacion con la clase
        OpenSol opensol = new OpenSol();            // relacion con la clase
        model.addAttribute("opensol", opensol);     // relacion con la clase
        return "suma";
    }
    
    @RequestMapping(value = "suma", method = RequestMethod.POST)
    public String sumaController(@ModelAttribute("opensol") OpenSol opensol, Model model) { // model model es para enviar objetos
        model.addAttribute("opensol", opensol);
        String op = "suma";
        model.addAttribute("op", op);
        String result = opensol.suma();
        model.addAttribute("result", result);
        
        if (result.equals("error")) {
            JOptionPane.showMessageDialog(null, "numero requerido");
            return "suma";
        } else {
            return "resultado";
        }
    }
    
//    Resta---------------------------------------------------------------------
    @RequestMapping(value = "resta", method = RequestMethod.GET)
    public String restaController(Model model) {     // relacion con la clase
        OpenSol opensol = new OpenSol();            // relacion con la clase
        model.addAttribute("opensol", opensol);     // relacion con la clase
        return "resta";
    }
    
    @RequestMapping(value = "resta", method = RequestMethod.POST)
    public String restaController(@ModelAttribute("opensol") OpenSol opensol, Model model) { // model model es para enviar objetos
        model.addAttribute("opensol", opensol);
        String op = "resta";
        model.addAttribute("op", op);
        String result = opensol.resta();
        model.addAttribute("result", result);
        if (result.equals("error")) {
            JOptionPane.showMessageDialog(null, "numero requerido");
            return "resta";
        } else {
            return "resultado";
        }
    }
    
//    Division -----------------------------------------------------------------    
    @RequestMapping(value = "divisio", method = RequestMethod.GET)
    public String divisioController(Model model) {     // relacion con la clase
        OpenSol opensol = new OpenSol();            // relacion con la clase
        model.addAttribute("opensol", opensol);     // relacion con la clase
        return "divisio";
    }
    
    @RequestMapping(value = "divisio", method = RequestMethod.POST)
    public String divisioController(@ModelAttribute("opensol") OpenSol opensol, Model model) { // model model es para enviar objetos
        model.addAttribute("opensol", opensol);
        String op = "divisio";
        model.addAttribute("op", op);
        String result = opensol.divisio();
        model.addAttribute("result", result);
        if (result.equals("error")) {
            JOptionPane.showMessageDialog(null, "numero requerido");
            return "divisio";
        } else {
            return "resultado";
        }
    }
    
//    Multiplicar---------------------------------------------------------------    
    @RequestMapping(value = "multiplicar", method = RequestMethod.GET)
    public String multiplicarController(Model model) {     // relacion con la clase
        OpenSol opensol = new OpenSol();            // relacion con la clase
        model.addAttribute("opensol", opensol);     // relacion con la clase
        return "multiplicar";
    }
    
    @RequestMapping(value = "multiplicar", method = RequestMethod.POST)
    public String multiplicarController(@ModelAttribute("opensol") OpenSol opensol, Model model) { // model model es para enviar objetos
        model.addAttribute("opensol", opensol);
        String op = "multiplicar";
        model.addAttribute("op", op);
        String result = opensol.multiplicar();
        model.addAttribute("result", result);
        if (result.equals("error")) {
            JOptionPane.showMessageDialog(null, "numero requerido");
            return "multiplicar";
        } else {
            return "resultado";
        }
    }
    
//    addBoject
//    @RequestMapping(value="resultado",method = RequestMethod.POST)
//    public ModelAndView formularioController(@ModelAttribute("opensol") OpenSol opensol) {
//        ModelAndView modelv2 = new ModelAndView("resultado");
//        modelv2.addObject("opensol",opensol);
//        return modelv2;
//    }
}
