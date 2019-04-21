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
    private int id_persona;
    private String nombre_persona;
    private String apellido_persona;
    private int edad_persona;

    public Persona() {
    }

    public Persona(String nombre_persona, String apellido_persona, int edad_persona) {
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.edad_persona = edad_persona;
    }
    
    public Persona(int id_persona, String nombre_persona, String apellido_persona, int edad_persona) {
        this.id_persona = id_persona;
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.edad_persona = edad_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public String getApellido_persona() {
        return apellido_persona;
    }

    public int getEdad_persona() {
        return edad_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    public void setEdad_persona(int edad_persona) {
        this.edad_persona = edad_persona;
    }
    
    
}
