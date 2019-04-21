/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionuf4_adriancanals;

/**
 *
 * @author Usuario
 */
final public class Soleqsegongrauincompleta1 extends Soleqsegongrau implements MiInterface1 {

    public Soleqsegongrauincompleta1() {
    }

    public Soleqsegongrauincompleta1(double coeficiente1, double coeficiente2, double coeficiente3) {
        super(coeficiente1, coeficiente2, coeficiente3);
    }
    
    
    
    @Override
    public void equsegongrauincompleta1(double a, double b) {
        int discri = discriminant (coeficiente1, coeficiente2, coeficiente3);
        if (discri == 1) {
            double res = 0;
            System.out.println("Tiene una solucion");
            System.out.println("X = " + res);
        }
        if (discri == 0) {
            System.out.println("No tiene soluciones");
        }
        if (discri == 2) {
            double res1 = 0;
            double res2 = -b/a;
            System.out.println("Tiene dos soluciones: ");
            System.out.println("X1: " + res1);
            System.out.println("X2: " + res2);
        }
    }
    
}
