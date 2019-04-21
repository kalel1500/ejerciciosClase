/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Scanner;
import model.Persona;

/**
 *
 * @author Usuario
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        
        String nombre = teclado.next();
        persona.setNombre(nombre);
        persona.setNombre(teclado.next());
        
        System.out.println(persona.getNombre());
    }
    
}
