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
    private String nombre;
    private int edad;
    private String poblacion;
    private String estudios;

    public Persona() {
    }

    public Persona(String nombre, int edad, String poblacion, String estudios) {
        this.nombre = nombre;
        this.edad = edad;
        this.poblacion = poblacion;
        this.estudios = estudios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPoblaicon() {
        return poblacion;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    
    @Override
    public String toString() {
        return nombre + ":" + edad + ":" + poblacion  + ":" + estudios;
    }
}
