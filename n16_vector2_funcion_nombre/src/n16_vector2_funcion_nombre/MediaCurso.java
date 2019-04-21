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
public class MediaCurso {
    private double notaMediaCurso;
    private String nombreUsuario;

    public MediaCurso() {
    }

    public MediaCurso(double notaMediaCurso, String nombreUsuario) {
        this.notaMediaCurso = notaMediaCurso;
        this.nombreUsuario = nombreUsuario;
    }

    public double getNotaMediaCurso() {
        return notaMediaCurso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNotaMediaCurso(double notaMediaCurso) {
        this.notaMediaCurso = notaMediaCurso;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
}


