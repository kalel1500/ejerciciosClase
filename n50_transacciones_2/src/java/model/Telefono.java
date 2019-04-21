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
public class Telefono {
    private int id_telefono;
    private String numero_telefono;
    private int id_persona;

    public Telefono() {
    }

    public Telefono(int id_telefono, String numero_telefono, int id_persona) {
        this.id_telefono = id_telefono;
        this.numero_telefono = numero_telefono;
        this.id_persona = id_persona;
    }

    public int getId_telefono() {
        return id_telefono;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_telefono(int id_telefono) {
        this.id_telefono = id_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    
    
    
}
