/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n32_trycatch;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Division {
    private double result;
    private double num1;
    private double num2;

    public Division() {
    }

    public Division(double result, double num1, double num2) {
        this.result = result;
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    
    public void funcionDivision () {
        try {
            int [] vector = {1,2,3};
            this.result = vector[5];
            System.out.println("El resultado es " + this.result);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Señor usuario, me ha introducido un dividendo 0. NO SE PUEDE DIVIDIR POR 0");
        }
    }
}
