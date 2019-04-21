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
public class OpenSol {
    private double num1;
    private double num2;

    public OpenSol() {
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double suma (double num1, double num2) {
        double resSuma = num1+num2;
        return resSuma;
    }
    
    public double resta (double num1, double num2) {
        double resSuma = num1-num2;
        return resSuma;
    }
    
    public double multiplicar (double num1, double num2) {
        double resSuma = num1*num2;
        return resSuma;
    }
    
    public double divisio (double num1, double num2) {
        double resSuma = num1/num2;
        return resSuma;
    }
}
