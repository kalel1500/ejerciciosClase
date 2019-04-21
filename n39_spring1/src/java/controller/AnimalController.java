/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */

@Controller
public class AnimalController {
    @RequestMapping("index")
    public String indexController(Model model) {
        return "index";
    }
    
    @RequestMapping("octavapaginaAnimal")
    public ModelAndView octavaController() {
        Animal animal = new Animal();
        animal.setNombre("Perro");
        animal.setEdad(7);
        animal.setRaza("Labrador");
        
        ModelAndView modelvAnim = new ModelAndView("octava");
        modelvAnim.addObject("animal",animal);
        return modelvAnim;
    }
}
