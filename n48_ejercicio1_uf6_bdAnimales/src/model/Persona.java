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
    private int id_animal;
    private String nombre_animal;
    private String raza_animal;
    private int edad_animal;
    
    public Persona() {
    }

    public Persona(String nombre_animal, String raza_animal, int edad_animal) {
        this.nombre_animal = nombre_animal;
        this.raza_animal = raza_animal;
        this.edad_animal = edad_animal;
    }
    
    public Persona(int id_animal, String nombre_animal, String raza_animal, int edad_animal) {
        this.id_animal = id_animal;
        this.nombre_animal = nombre_animal;
        this.raza_animal = raza_animal;
        this.edad_animal = edad_animal;
    }

    public Persona(int id_animal, String nombre_animal, String raza_animal, int edad_animal, String sexo_animal, int id_departamento) {
        this.id_animal = id_animal;
        this.nombre_animal = nombre_animal;
        this.raza_animal = raza_animal;
        this.edad_animal = edad_animal;
    }
    
    

    public int getId_animal() {
        return id_animal;
    }

    public String getNombre_animal() {
        return nombre_animal;
    }

    public String getRaza_animal() {
        return raza_animal;
    }

    public int getEdad_animal() {
        return edad_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public void setNombre_animal(String nombre_animal) {
        this.nombre_animal = nombre_animal;
    }

    public void setRaza_animal(String raza_animal) {
        this.raza_animal = raza_animal;
    }

    public void setEdad_animal(int edad_animal) {
        this.edad_animal = edad_animal;
    }
    
    
}
