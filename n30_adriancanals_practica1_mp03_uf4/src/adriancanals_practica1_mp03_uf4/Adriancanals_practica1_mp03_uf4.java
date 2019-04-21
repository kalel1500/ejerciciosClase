/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adriancanals_practica1_mp03_uf4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Adriancanals_practica1_mp03_uf4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce coeficiente a:");
        double a =  teclado.nextDouble();
        
        System.out.println("Introduce coeficiente b:");
        double b =  teclado.nextDouble();
        
        System.out.println("Introduce coeficiente c:");
        double c =  teclado.nextDouble();
        
        Soleqsegongraucompl solucion = new Soleqsegongraucompl(a, b, c);
        
        solucion.eqsegongraucompl(a, b, c);
    }
    
}
