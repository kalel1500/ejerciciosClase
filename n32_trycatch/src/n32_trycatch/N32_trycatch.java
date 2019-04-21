/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n32_trycatch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N32_trycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Division division = new Division();
        
        System.out.println("Introduce el primer numero");
        division.setNum1(teclado.nextDouble());
        System.out.println("Introduce el segundo numero");
        division.setNum2(teclado.nextDouble());
        
        division.funcionDivision();
    }
    
}
