/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adriancanals_practica1_mp03_uf4;

/**
 *
 * @author Usuario
 */
final public class Soleqsegongraucompl extends Soleqsegongrau {

    public Soleqsegongraucompl() {
    }

    public Soleqsegongraucompl(double coeficiente1, double coeficiente2, double coeficiente3) {
        super(coeficiente1, coeficiente2, coeficiente3);
    }
    
    
    
    
    public void eqsegongraucompl (double coeficiente1, double coeficiente2, double coeficiente3) {
        int discriminant = discriminante (coeficiente1, coeficiente2, coeficiente3);
        if (discriminant == 1) {
            double res = -coeficiente2/(2*coeficiente1);
            System.out.println("Tiene una solucion, y es: " + res);
        }
        if (discriminant == 0) {
            System.out.println("No tiene soluciones");
        }
        if (discriminant == 2) {
            double a = coeficiente1;
            double b = coeficiente2;
            double c = coeficiente3;
            double raiz = Math.sqrt(b*b-(4*a*c));
            double res1 = (-b + raiz)/(2*a);
            double res2 = (-b - raiz)/(2*a);
            System.out.println("Tiene dos soluciones: ");
            System.out.println("X1: " + res1);
            System.out.println("X2: " + res2);
        }
    }
}
