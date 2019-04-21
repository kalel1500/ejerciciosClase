/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n33_pruebastringdouble;

/**
 *
 * @author Usuario
 */
public class Operaciones implements Misfunciones {
    private double a;
    private double b;

    public Operaciones() {
    }

    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    

    @Override
    public double suma(double a, double b) {
        double suma = a+b;
        return suma;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public StringDouble division(double a, double b) {
        StringDouble midivision = new StringDouble();
        if (b == 0) {
            midivision.setMensaje("No se puede dividir por 0");
        } else {
            midivision.setResult(a/b);
            midivision.setMensaje("Okay");
        }
        return midivision;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a*b;
    }

    @Override
    public double raizcuadrada(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
    
    
}
