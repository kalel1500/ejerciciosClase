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
abstract public class Soleqsegongrau {
    protected double coeficiente1;
    protected double coeficiente2;
    protected double coeficiente3;

    public Soleqsegongrau() {
    }

    public Soleqsegongrau(double coeficiente1, double coeficiente2, double coeficiente3) {
        this.coeficiente1 = coeficiente1;
        this.coeficiente2 = coeficiente2;
        this.coeficiente3 = coeficiente3;
    }
    
    public int discriminant (double coeficiente1, double coeficiente2, double coeficiente3) {
        double midiscri = coeficiente2*coeficiente2 - (4* coeficiente1* coeficiente3);
        
        if (midiscri == 0) {
            return 1;
        }
        if (midiscri > 0) {
            return 2;
        } else {
            return 0;
        }
    }
}
