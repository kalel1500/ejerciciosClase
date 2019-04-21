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
    private String password_persona;
    private String email_persona;
    private String numero_telefono1;
    private String numero_telefono2;
    private String numero_telefono3;

    public Persona() {
    }

    public Persona(int id_persona, String nombre_persona, String password_persona, String email_persona) {
        this.id_persona = id_persona;
        this.nombre_persona = nombre_persona;
        this.password_persona = password_persona;
        this.email_persona = email_persona;
    }

    public Persona(String nombre_persona, String password_persona, String email_persona) {
        this.nombre_persona = nombre_persona;
        this.password_persona = password_persona;
        this.email_persona = email_persona;
    }

    public Persona(int id_persona, String nombre_persona, String password_persona, String email_persona, String numero_telefono1, String numero_telefono2, String numero_telefono3) {
        this.id_persona = id_persona;
        this.nombre_persona = nombre_persona;
        this.password_persona = password_persona;
        this.email_persona = email_persona;
        this.numero_telefono1 = numero_telefono1;
        this.numero_telefono2 = numero_telefono2;
        this.numero_telefono3 = numero_telefono3;
    }
    
    

    public int getId_persona() {
        return id_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public String getPassword_persona() {
        return password_persona;
    }

    public String getEmail_persona() {
        return email_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public void setPassword_persona(String password_persona) {
        this.password_persona = password_persona;
    }

    public void setEmail_persona(String email_persona) {
        this.email_persona = email_persona;
    }

    public void setNumero_telefono1(String numero_telefono1) {
        this.numero_telefono1 = numero_telefono1;
    }

    public void setNumero_telefono2(String numero_telefono2) {
        this.numero_telefono2 = numero_telefono2;
    }

    public void setNumero_telefono3(String numero_telefono3) {
        this.numero_telefono3 = numero_telefono3;
    }

    public String getNumero_telefono1() {
        return numero_telefono1;
    }

    public String getNumero_telefono2() {
        return numero_telefono2;
    }

    public String getNumero_telefono3() {
        return numero_telefono3;
    }

    
    
    
    
}
