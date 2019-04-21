/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n14_vector2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N14_vector2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> lista=new ArrayList<Double>();
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double nota;
        System.out.println("Pulse -1 para salir");
        do {
            System.out.println("Escribe la nota " + (lista.size()+1));
            nota = teclado.nextDouble();
            if (nota>=0) {
                lista.add(nota);
            }
        } while (nota>=0);
        
        for (Double a:lista) {
            media = media + a;
        }
        media = media/(lista.size());
        System.out.println("La media es: " + media);
    }
    
}
