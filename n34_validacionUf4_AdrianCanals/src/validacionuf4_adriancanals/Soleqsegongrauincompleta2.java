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
final public class Soleqsegongrauincompleta2 extends Soleqsegongrau implements MiInterface2 {

    public Soleqsegongrauincompleta2() {
    }

    public Soleqsegongrauincompleta2(double coeficiente1, double coeficiente2, double coeficiente3) {
        super(coeficiente1, coeficiente2, coeficiente3);
    }
    
    

    @Override
    public void equsegongrauincompleta2(double a, double c) {
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
            double res1 = +Math.sqrt(-c/a);
            double res2 = -Math.sqrt(-c/a);
            System.out.println("Tiene dos soluciones: ");
            System.out.println("X1: " + res1);
            System.out.println("X2: " + res2);
        }
    }
    
}
