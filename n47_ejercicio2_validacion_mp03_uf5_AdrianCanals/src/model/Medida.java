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
public class Medida {
    private String celsius;
    private String fahrenheit;

    public Medida() {
    }

    public Medida(String celsius, String fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public String calularMedida(String cual, double temp) {
        String res;
        double op = 0;
        if (cual.equals("fahrenheit")) {
            op = (temp*9.0/5.0) + 32;
        }
        
        if (cual.equals("celsius")) {
            op = ((temp-32)/(9.0/5.0));
        }
        res = Double.toString(op);
        return res;
    }
}
