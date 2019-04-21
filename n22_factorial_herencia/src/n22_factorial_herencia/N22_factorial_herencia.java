/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n22_factorial_herencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N22_factorial_herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        FactorialPadre fp = new FactorialPadre();
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        fp.setNumero(numero);
        long res = fp.calculoFactorial();
        System.out.println(res);
        
        FactorialHijo fh = new FactorialHijo();
        System.out.println("Introduce un numero");
        int numero1 = teclado.nextInt();
        fh.setNumero(numero1);
        long resHijo = fh.calculoFactorial();
        System.out.println(resHijo);
    }
}
