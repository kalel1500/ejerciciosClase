/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n23_equacion_herencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N23_equacion_herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int a = teclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        int b = teclado.nextInt();
        System.out.println("Introduce el tercer numero:");
        int c = teclado.nextInt();
        
        Completa completaMarc = new Completa(a, 0, c);
        Incompleta incompletaMarc = new Incompleta(a, b, c);
        
        Solucion sol = completaMarc.completaSol();
        Solucion sol2 = incompletaMarc.completaSol();
        System.out.println("Las soluciones de la equiacione compltea son:" + sol.getSol1() + " y " + sol.getSol2());
        System.out.println("Las soluciones de la equiacione incompltea son:" + sol2.getSol1() + " y " + sol2.getSol2());
    }
    
}
