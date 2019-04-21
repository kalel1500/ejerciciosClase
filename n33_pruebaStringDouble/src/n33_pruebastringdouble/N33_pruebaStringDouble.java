/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n33_pruebastringdouble;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N33_pruebaStringDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce coeficiente a:");
        double a =  teclado.nextDouble();
        
        System.out.println("Introduce coeficiente b:");
        double b =  teclado.nextDouble();
        
        Operaciones misop = new Operaciones(a, b);
        
        StringDouble res = misop.division(a, b);
        
        //double result = res.getResult();
        //String mensaje = res.getMensaje();
        
        if(res.getMensaje().equals("Okay")) {
            System.out.println("El resultado es: " + res.getResult());
        } else {
            System.out.println(res.getMensaje());
        }
        
    }
    
}
