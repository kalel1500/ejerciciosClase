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
    private int contador;
    private String nombre;
    private int numeroHijos;
    private String telefono;
    private String nombreHijo1;
    private String nombreHijo2;
    private String cuentaBancarea;
    private String titulacion;
    private int edad;
    private int sueldo;

    public Persona() {
    }

    public Persona(int contador, String nombre, int numeroHijos, String telefono, String nombreHijo1, String nombreHijo2, String cuentaBancarea, String titulacion, int edad, int sueldo) {
        this.contador = contador;
        this.nombre = nombre;
        this.numeroHijos = numeroHijos;
        this.telefono = telefono;
        this.nombreHijo1 = nombreHijo1;
        this.nombreHijo2 = nombreHijo2;
        this.cuentaBancarea = cuentaBancarea;
        this.titulacion = titulacion;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public int getContador() {
        return numeroHijos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombreHijo1() {
        return nombreHijo1;
    }

    public String getNombreHijo2() {
        return nombreHijo2;
    }

    public String getCuentaBancarea() {
        return cuentaBancarea;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getEdad() {
        return edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombreHijo1(String nombreHijo1) {
        this.nombreHijo1 = nombreHijo1;
    }

    public void setNombreHijo2(String nombreHijo2) {
        this.nombreHijo2 = nombreHijo2;
    }

    public void setCuentaBancarea(String cuentaBancarea) {
        this.cuentaBancarea = cuentaBancarea;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
