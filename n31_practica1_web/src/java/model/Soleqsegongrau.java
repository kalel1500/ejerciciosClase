/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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

    public double getCoeficiente1() {
        return coeficiente1;
    }

    public double getCoeficiente2() {
        return coeficiente2;
    }

    public double getCoeficiente3() {
        return coeficiente3;
    }

    public void setCoeficiente1(double coeficiente1) {
        this.coeficiente1 = coeficiente1;
    }

    public void setCoeficiente2(double coeficiente2) {
        this.coeficiente2 = coeficiente2;
    }

    public void setCoeficiente3(double coeficiente3) {
        this.coeficiente3 = coeficiente3;
    }
    
    
    
    public int discriminant (double coeficiente1, double coeficiente2, double coeficiente3) {
        // Operaciones misop = new Operaciones();
        // double midiscri = misop.resta(misop.potencia(coeficiente2, 2), misop.multiplicacion(4, misop.multiplicacion(coeficiente1, coeficiente3)));
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
