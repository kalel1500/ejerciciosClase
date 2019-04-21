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
    // Atributos
    String nombre;
    String apellido;
    int edad;
    int cuentabancaria;
    String DNI;
    
    // Constructor
    public Persona() {
    }
    
    // Metodos accesores
    // Geters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCuentabancaria() {
        return cuentabancaria;
    }

    public String getDNI() {
        return DNI;
    }
    
    // Seters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuentabancaria(int cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
}
