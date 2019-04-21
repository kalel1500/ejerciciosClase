/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n29_sigma_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N29_SIGMA_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Creacion de la combinacion........................................
        int combinacion[];
        combinacion = new int[5];
        // calculo de la combinacion
        for (int i = 0; i < 5; i++) {
            boolean asignar = true;
            // numero aleatorio
            int numNuevo = (int) (Math.random()*10);
            if (i == 0) {
                 combinacion[i] = numNuevo;
            } else {
                // comprobacion de no repeticion
                for (int a = 0; a <= i; a++) {
                    if (numNuevo == combinacion[a]) {
                        asignar = false;
                        i--;
                    }
                }
                if (asignar) {
                    combinacion[i] = numNuevo;
                }
            }
        }
        // chivato
        System.out.println("---------------");
        for (int i = 0; i < 5; i++) {
            System.out.print(combinacion[i]);
        }
        System.out.println("");
        System.out.println("---------------");
        
        // 2. Pedir el numero maximo de jugadas.................................
        Scanner scanner = new Scanner(System.in);
        int numIntentos;
        do {
            System.out.println("Introduce el numero maximo de jugadas (min 4 | max 20):");
            numIntentos = scanner.nextInt();
        } while (numIntentos < 4 || numIntentos > 20);
        
        // 3. Pedir una jugada..................................................
        int jugada [];
        jugada =  new int [5];
        String textoIntrod;
        char[] arrayTexto;
        int suma = 0;
        do {
            System.out.println("Introduce tu jugada (5 num | 0-9 | sin repetir):");
            textoIntrod = scanner.next();
            if (textoIntrod.length() == 5) {
                arrayTexto = textoIntrod.toCharArray();
                
                for (int i = 0; i < 5; i++) {
                    boolean asignar = true;
                    // numero aleatorio
                    int numIntrod = Integer.parseInt(Character.toString(arrayTexto[i]));
                    // int numIntrod = Integer.parseInt(""+arrayTexto[i]);
                    
                    if (i == 0) {
                         jugada[i] = numIntrod;
                    } else {
                        // comprobacion de no repeticion
                        for (int a = 0; a <= i; a++) {
                            if (numIntrod == jugada[a]) {
                                asignar = false;
                                i--;
                            }
                        }
                        if (asignar) {
                            jugada[i] = numIntrod;
                        }
                    }
                }
            }
            
            // comparacion
            
            for (int i = 0; i < 5; i++) {
                if (jugada[i] == combinacion[i]) {
                    suma++;
                }
            }
            if (suma != 5) {
                    System.out.println("Incorrecto");
            }
        } while (textoIntrod.length() != 5 || suma != 5);
        
        
        
    }
    
}
