/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_aplicacion_consola;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mi_aplicacion_consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SUMA");
        Scanner reader = new Scanner(System.in);
        Operacion op = new Operacion();
        System.out.println("Introduce el primer numero");
        op.n1 = reader.nextDouble();
        System.out.println("Introduce el segundo numero");
        op.n2 = reader.nextDouble();
        double result = op.suma();
        System.out.println("El resultado es: " + result);
        //System.out.println("El resultado es: " + op.suma());
        
        System.out.println("RESTA");
        System.out.println("Introduce el primer numero");
        op.n1 = reader.nextDouble();
        System.out.println("Introduce el segundo numero");
        op.n2 = reader.nextDouble();
        result = op.resta();
        System.out.println("El resultado es: " + result);
        
        System.out.println("MULTIPLICACION");
        System.out.println("Introduce el primer numero");
        op.n1 = reader.nextDouble();
        System.out.println("Introduce el segundo numero");
        op.n2 = reader.nextDouble();
        result = op.multiplicacion();
        System.out.println("El resultado es: " + result);
        
        System.out.println("DIVISION");
        System.out.println("Introduce el primer numero");
        op.n1 = reader.nextDouble();
        System.out.println("Introduce el segundo numero");
        op.n2 = reader.nextDouble();
        if (op.n2 != 0) {
            result = op.division();
            System.out.println("El resultado es: " + result);
        } else {
            System.out.println("No se puede dividir entre 0");
        }
        
        
        /*System.out.println("Introduce el primer numero entero");
        double n1 = reader.nextInt();
        System.out.println("Introduce el segundo nuemro entero");
        double n2 = reader.nextInt();
        double result = n1+n2;
        System.out.println("El resultado es: " + result);
        
        System.out.println("Introduce el primer numero entero");
        n1 = reader.nextInt();
        System.out.println("Introduce el segundo nuemro entero (que no sea 0)");
        n2 = reader.nextInt();
        if (n2 != 0) {
        result = n1/n2;
        System.out.println("El resultado es: " + result);
        } else {
            System.out.println("No se puede dividir entre 0");
        }*/
    }
    
}
