/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n18_recursividad_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N18_recursividad_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado;
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        resultado = recursividad (num);
        System.out.println("El factorial de " + num + " es " + resultado);
    }
    
    public static int recursividad (int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * (recursividad (numero-1));
        }
    }
}
