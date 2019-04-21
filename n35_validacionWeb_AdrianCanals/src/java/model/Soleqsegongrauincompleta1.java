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
final public class Soleqsegongrauincompleta1 extends Soleqsegongrau implements MiInterface1 {
    int numsolu;
    double a;
    double b;

    public Soleqsegongrauincompleta1() {
    }

    public Soleqsegongrauincompleta1(double coeficiente1, double coeficiente2, double coeficiente3) {
        super(coeficiente1, coeficiente2, coeficiente3);
    }

    public int getNumsolu() {
        return numsolu;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setNumsolu(int numsolu) {
        this.numsolu = numsolu;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
    
    
    @Override
    public void equsegongrauincompleta1(double a, double b) {
        int discri = discriminant (coeficiente1, coeficiente2, coeficiente3);
        if (discri == 1) {
            double res = 0;
            this.numsolu = 1;
            this.a = res;
        }
        if (discri == 0) {
            this.numsolu = 0;
        }
        if (discri == 2) {
            double res1 = 0;
            double res2 = -b/a;
            this.numsolu = 2;
            this.a = res1;
            this.b = res2;
        }
    }
    
}
