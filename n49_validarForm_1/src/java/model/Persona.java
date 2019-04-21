/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private int id;
    
    @NotEmpty(message = "Ingrese nombre")
    @NotNull(message = "No puede estar vacio")
    private String nombre;
    
    @NotEmpty(message = "Ingrese password")
    @Size(min=5, max=10, message="La contra debe tener 5 caracteres minimo")
    @NotNull(message = "No puede estar vacio")
    private String password;
    
    @NotEmpty(message = "Ingrese email")
    @NotNull(message = "No puede estar vacio")
    private String email;

    public Persona() {
    }

    public Persona(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    public Persona(int id, String nombre, String password, String email) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}
