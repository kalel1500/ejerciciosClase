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
public class StringDouble {
    private double result;
    private String mensaje;

    public StringDouble() {
    }

    public StringDouble(double result, String mensaje) {
        this.result = result;
        this.mensaje = mensaje;
    }

    public double getResult() {
        return result;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
