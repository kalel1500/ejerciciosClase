/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class OpenSol {
    private String num1;
    private String num2;

    public OpenSol() {
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
    
    public String suma() {
        String resultado;
        try {
            double numero1 = Double.valueOf(num1);
            double numero2 = Double.valueOf(num2);
            double res = numero1+numero2;
            resultado = String.valueOf(res);
        } catch (Exception e) {
            resultado = "error";
        }
        return resultado;
    }
    
    public String resta() {
        String resultado;
        try {
            double numero1 = Double.valueOf(num1);
            double numero2 = Double.valueOf(num2);
            double res = numero1-numero2;
            resultado = String.valueOf(res);
        } catch (Exception e) {
            resultado = "error";
        }
        return resultado;
    }
    
    public String multiplicar() {
        String resultado;
        try {
            double numero1 = Double.valueOf(num1);
            double numero2 = Double.valueOf(num2);
            double res = numero1*numero2;
            resultado = String.valueOf(res);
        } catch (Exception e) {
            resultado = "error";
        }
        return resultado;
    }
    
    public String divisio() {
        String resultado;
        try {
            double numero1 = Double.valueOf(num1);
            double numero2 = Double.valueOf(num2);
            if (numero2 == 0) {
                resultado = "No se puede dividr entre 0";
            } else {
                double res = numero1/numero2;
                resultado = String.valueOf(res);
            }
        } catch (Exception e) {
            resultado = "error";
        }
        return resultado;
    }
}
