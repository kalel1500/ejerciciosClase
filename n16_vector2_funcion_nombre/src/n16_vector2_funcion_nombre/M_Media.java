/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n16_vector2_funcion_nombre;

/**
 *
 * @author Usuario
 */
public class M_Media {
    private String nombre;
    private double notaMedia;
    private String nombreUsuario;

    public M_Media() {
    }

    public M_Media(String nombre, double notaMedia, String nombreUsuario) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
