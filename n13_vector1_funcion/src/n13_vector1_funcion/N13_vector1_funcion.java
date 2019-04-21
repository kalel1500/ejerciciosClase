/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n13_vector1_funcion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N13_vector1_funcion {
    static Scanner teclado = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear vectores para guardar las notas
        double vectorBd[] = new double[3];
        double vectorJava[] = new double[3];
        double vectorPHP[] = new double[3];
        // Llamada a la funcion
        calcularMedia(vectorBd, "Base de Datos");
        calcularMedia(vectorJava, "Java");
        calcularMedia(vectorPHP, "PHP");
    }
    public static void calcularMedia(double vector[], String nombreMateria) {
        int i;
        double media=0;
        for (i=0; i<vector.length; i++) {
            System.out.println("Introducir la nota " + (i+1) + " de " + nombreMateria + ":");
            vector[i]=teclado.nextDouble();
            media=media+vector[i];
        }
        media=media/vector.length;
        System.out.println("La nota media de " + nombreMateria + " es: "+ media);
    }
}
