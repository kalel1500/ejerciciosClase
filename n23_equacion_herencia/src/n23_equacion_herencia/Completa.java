/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n23_equacion_herencia;

/**
 *
 * @author Usuario
 */
public class Completa {
    protected int a;
    protected int b;
    protected int c;

    public Completa() {
    }

    public Completa(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
    public Solucion completaSol() {
        Solucion result = new Solucion();
        double x1 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        double x2 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        result.setSol1(x1);
        result.setSol2(x2);
        return result;
    }
}
