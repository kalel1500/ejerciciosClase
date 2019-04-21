/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import model.Conexion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("/")
public class BaseController {
    private Conexion con = new Conexion();
    private Connection connect = con.conectar();
    
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String indexController() {
        return "index";
    }
    
    @RequestMapping(value = "suma", method = RequestMethod.GET)
    public String sumaController(Model model) {     
        //model.addAttribute("opensol", opensol);
        return "suma";
    }
}
