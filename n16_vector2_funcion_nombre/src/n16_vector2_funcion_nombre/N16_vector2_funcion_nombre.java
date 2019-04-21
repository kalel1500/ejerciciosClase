/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n16_vector2_funcion_nombre;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class N16_vector2_funcion_nombre {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Double> lista=new ArrayList<Double>();
        ArrayList<M_Media> listaMediaTotal = new ArrayList<M_Media>();
        String nombreMateria;
        String nombreUsuario;
        do {
            System.out.println("Introduce tu nombre (pulsa 's' para salir)");
            nombreUsuario = teclado.next();
            if (!nombreUsuario.equals("s")) {
                do {
                    System.out.println("Introduce el nombre de la materia (pulsa 'q' para salir)");
                    nombreMateria = teclado.next();
                    if (!nombreMateria.equals("q")) {
                        calcularMedia(lista, nombreMateria, listaMediaTotal, nombreUsuario);
                    } else {
                        break;
                    }
                } while (nombreMateria != "q");
            } else {
                break;
            }
        } while (nombreUsuario != "s");
                
        System.out.println("-------------------");
        System.out.println("RESUMEN");
        for (M_Media a:listaMediaTotal) {
            System.out.println(a.getNombreUsuario() + "-->" + a.getNombre() + ": " + a.getNotaMedia());
        }
    }
    
    public static void calcularMedia (ArrayList<Double> lista, String materia, ArrayList<M_Media> listaMediaTotal, String nombreUsuario) {
        double nota;
        double media = 0;
        System.out.println("Escribe las notas de " + materia + " (pulse -1 para salir)");
        lista.clear();
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
        System.out.println("La media es de " + materia + " es: " + media);
        
        M_Media juntar = new M_Media(materia,media,nombreUsuario);
        listaMediaTotal.add(juntar);
        System.out.println("----");
    }
    
}
