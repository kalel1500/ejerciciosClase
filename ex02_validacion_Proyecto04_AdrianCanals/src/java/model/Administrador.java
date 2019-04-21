/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Usuario
 */
public class Administrador {
    private int admin_id;
    
    @Email(message = "Debes introducir un email")
    @NotBlank(message = "Email requerido")
    private String admin_correo;
    
    @NotBlank(message = "Contraseña requerido")
    @Size(min=4, max=20, message="La contra debe contener entre 4 y 20 caracteres")
    private String admin_password;
    
    @NotNull(message = "Edad requerido")
    private int admin_edad;

    
    public Administrador() {
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public String getAdmin_correo() {
        return admin_correo;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public int getAdmin_edad() {
        return admin_edad;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public void setAdmin_correo(String admin_correo) {
        this.admin_correo = admin_correo;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public void setAdmin_edad(int admin_edad) {
        this.admin_edad = admin_edad;
    }
    
    
}
