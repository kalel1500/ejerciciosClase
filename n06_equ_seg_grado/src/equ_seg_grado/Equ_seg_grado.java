/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equ_seg_grado;

import java.awt.BorderLayout;
import java.util.Scanner;
import modelo.Discriminante;

/**
 *
 * @author Usuario
 */
public class Equ_seg_grado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Discriminante disc = new Discriminante();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la a:");
        double a = teclado.nextDouble();
        System.out.print("Introduce la b:");
        double b = teclado.nextDouble();
        System.out.print("Introduce la c:");
        double c = teclado.nextDouble();
        String mensaje = disc.discriminante(a, b, c);
        System.out.print(mensaje);
        
        int solucion = disc.solucion(a, b, c);
        if(solucion==2) {
            System.out.println(disc.getX1());
            System.out.println(disc.getX2());
            double x1 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
            double x2 = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
            System.out.println("La solucion 1 es: "+x1+"\nLa solucion 2 es:"+x2+"\n");
        }
        if(solucion==1) {
            System.out.println(disc.getX1());
            double x = -b/(2*a);
            System.out.println("La solucion es: "+x);
        }
    }
    
}
