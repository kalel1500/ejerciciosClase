/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_aplicacion_consola2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mi_aplicacion_consola2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Operacion op = new Operacion();
        
        System.out.println("SUMA");
        System.out.println("Introduce el primer numero");
        String num1 = reader.next();
        op.n1 = Float.parseFloat(num1);
        
        System.out.println("Introduce el segundo numero");
        String num2 = reader.next();
        op.n2 = Float.parseFloat(num2);
                
        System.out.println(op.suma());
        
    }
    
}
