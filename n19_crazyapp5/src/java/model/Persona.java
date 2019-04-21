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
public class Persona {
    // Atributos de la clase
    private String nombre;
    private String operacion;
    private double numero1;
    private double numero2;
    private double resultado;
    
    // Constructores
    // Constructor vacio
    public Persona() {
    }
    // Constructor con todo
    public Persona(String nombre, String operacion, double numero1, double numero2, double resultado) {
        this.nombre = nombre;
        this.operacion = operacion;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    // Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    // Metodos propiaos
    public double suma () {
        double resultado = 0;
        resultado = numero1 + numero2;
        return resultado;
    }
    
    public double resta () {
        double resultado = 0;
        resultado = numero1 - numero2;
        return resultado;
    }
    
    public double multiplicacion () {
        double resultado = 0;
        resultado = numero1 * numero2;
        return resultado;
    }
    
    public double division () {
        double resultado = 0;
        resultado = numero1 / numero2;
        return resultado;
    }
    
}
