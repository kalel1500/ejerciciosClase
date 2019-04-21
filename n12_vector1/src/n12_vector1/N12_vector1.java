/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n12_vector1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N12_vector1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear vectores para guardar las notas
        double notaJava[] = new double [3];
        double notaBd[] = new double [3];
        // Generar un objeto (teclado) que nos permite recoger  datos por teclado
        Scanner teclado = new Scanner (System.in);
        // Pedir las notas y guardar las notas en los vectores
        System.out.println("Introducir la nota 1 de java:");
        notaJava[0] = teclado.nextDouble();
        System.out.println("Introducir la nota 2 de java:");
        notaJava[1] = teclado.nextDouble();
        System.out.println("Introducir la nota 3 de java:");
        notaJava[2] = teclado.nextDouble();
        // Sumar las notas y dividirlas por el cardinal
        double resultado = notaJava[0] + notaJava[1] + notaJava[2];
        resultado = resultado/3;
        // Mostrar el resultado
        System.out.println("La media de Java es: " + resultado);
        
        // Lo mismo para las notas de base de datos
        System.out.println("Introducir la nota 1 de Bd:");
        notaBd[0] = teclado.nextDouble();
        System.out.println("Introducir la nota 2 de Bd:");
        notaBd[1] = teclado.nextDouble();
        System.out.println("Introducir la nota 3 de Bd:");
        notaBd[2] = teclado.nextDouble();
        resultado = notaBd[0] + notaBd[1] + notaBd[2];
        resultado = resultado/3;
        System.out.println("La media de Bd es: " + resultado);
    }
}
