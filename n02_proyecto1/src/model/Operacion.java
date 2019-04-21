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
public class Operacion {
    // atributos de la classe
    public float num1;
    public float num2;
    public String resul;
    
    // metodos
    
    /*public int suma(int num1,int num2){
        int resul = num1+num2;
        return resul;
    }ANTIGUO*/
    public String suma1(float num1,float num2){
        String resul = String.valueOf(num1+num2);
        return resul;
    }
    /*public int resta(int num1,int num2){
        int resul = num1-num2;
        return resul;
    }*/
    public String resta1(float num1,float num2){
        String resul = String.valueOf(num1-num2);
        return resul;
    }
    /*public int multiplicacion(int num1,int num2){
        int resul = num1*num2;
        return resul;
    }*/
    public String multiplicacion1(float num1,float num2){
        String resul = String.valueOf(num1*num2);
        return resul;
    }
    /*public int division(int num1,int num2){
        int resul = num1/num2;
        return resul;
    }*/
    public String division1(float num1,float num2){
        if(num2 > 0) {
            String resul = String.valueOf(num1/num2);
            return resul;
            
        } else {
            resul = "No se puede dividir entre 0";
            return resul;
        }
    }
}
