/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_vectores2_funcion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyecto_vectores2_funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Double> listaNotasJava=new ArrayList<Double>();
        int_notas(listaNotasJava, "Java");
        ArrayList<Double> listaNotasBD=new ArrayList<Double>();
        int_notas(listaNotasBD, "Materia2");
        
    }
    
    public static void int_notas (ArrayList<Double> listaNotasJava, String materia) {
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double nota;
        System.out.println("Escribe las notas de " + materia);
        System.out.println("Pulse -1 para salir");
        do {
            System.out.println("Escribe la nota " + (listaNotasJava.size()+1));
            nota = teclado.nextDouble();
            if (nota>=0) {
                listaNotasJava.add(nota);
            }
        } while (nota>0);
        
        for (Double a:listaNotasJava) {
            media = media + a;
        }
        media = media/(listaNotasJava.size());
        System.out.println("La media es de " + materia + " es: " + media);
    }
}
