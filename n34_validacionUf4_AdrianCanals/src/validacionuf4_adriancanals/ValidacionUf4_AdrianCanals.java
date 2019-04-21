/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionuf4_adriancanals;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ValidacionUf4_AdrianCanals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Equacion incompleta 1");
        System.out.println("Introduce coeficiente a:");
        double a1 =  teclado.nextDouble();
        System.out.println("Introduce coeficiente b:");
        double b1 =  teclado.nextDouble();
        
        Soleqsegongrauincompleta1 solucion1 = new Soleqsegongrauincompleta1(a1, b1, 0);
        solucion1.equsegongrauincompleta1(a1, b1);
        
        System.out.println("---------------------------------------------------");
        
        System.out.println("Equacion incompleta 2");
        System.out.println("Introduce coeficiente a:");
        double a2 =  teclado.nextDouble();
        System.out.println("Introduce coeficiente c:");
        double c2 =  teclado.nextDouble();
        
        Soleqsegongrauincompleta2 solucion2 = new Soleqsegongrauincompleta2(a2, 0, c2);
        solucion2.equsegongrauincompleta2(a2, c2);
    }
    
}
