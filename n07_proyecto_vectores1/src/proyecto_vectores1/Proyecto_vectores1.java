/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_vectores1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyecto_vectores1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //version 1
        /*double notasBd[] = new double[3]; //es equivalente a esto: -- double[] notasBd = new double[3]; --
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la nota 1");
        notasBd[0]=teclado.nextDouble();
        System.out.println("Escribe la nota 2");
        notasBd[1]=teclado.nextDouble();
        System.out.println("Escribe la nota 3");
        notasBd[2]=teclado.nextDouble();
        double media = notasBd[0] + notasBd[1] + notasBd[2];
        media = media/3;
        System.err.println("La media de tus notas es: "+media); // err es la salida de error
        //double notasJava[]= {10,5.2,10}; // otra manera de inicializar vectores
        //System.out.println(notasJava.length); //para mostrar cuantas casillas tiene
        */
        
        //version 2 (con funcion)
        int numeroNotas=4;
        double vectorBd[] = new double[numeroNotas];
        double vectorJava[] = new double[numeroNotas];
        double vectorPhp[] = new double[numeroNotas];
        introducir_datos(vectorBd, "Base de Datos", numeroNotas);
        introducir_datos(vectorJava, "Java", numeroNotas);
        introducir_datos(vectorPhp, "PHP", numeroNotas);
    }
    public static void introducir_datos (double[] vector, String texto, int numeroNotas) {
        //vector = new double[3];
        int i;
        double media=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe las notas de " + texto);
        for (i=0; i<numeroNotas; i++) {
            System.out.println("Escribe la nota " + (i+1));
            vector[i]=teclado.nextDouble();
            media=media+vector[i];
        }
        media=media/vector.length;
        System.out.println("La nota media de " + texto + " es: "+ media);
    }
}
