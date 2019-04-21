/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_vectores2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyecto_vectores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> listaNotasJava=new ArrayList<Double>();
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double nota;
        System.out.println("Pulse -1 para salir");
        do {
            System.out.println("Escribe la nota " + (listaNotasJava.size()+1));
            nota = teclado.nextDouble();
            if (nota>=0) {
                listaNotasJava.add(nota);
                //media = media + nota;
            }
        } while (nota>0);
        
        for (Double a:listaNotasJava) {
            //System.out.println(a);
            media = media + a;
        }
        media = media/(listaNotasJava.size());
        System.out.println("La media es: " + media);
        
    }
}
