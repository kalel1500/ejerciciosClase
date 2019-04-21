/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    private String poblacion;
    private String estudios;
    ArrayList <Persona> listaPersonas = new ArrayList <Persona>();

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

    public String getPoblacion() {
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
    
    
    
    // lee del fichero de texto ficheroEscirbirAnimal.txt
    public void leerDatos() {
        try {
            // indico donde esta el fichero (ruta) (2ª lin)
            // Pasar los datos a un buffer para leerlo desde la memoria ram (2ª lin)
            FileReader fichero = new FileReader("C:\\Users\\Usuario\\Desktop\\ADRIAN\\INFORMATICA\\DAW2\\SerjioJava\\DatosImportantes.txt");
            BufferedReader datos = new BufferedReader(fichero);
            
            String linea = datos.readLine();
            while(linea != null) {
                Persona miPersona = new Persona();
                String fila[] = linea.split(":");
                miPersona.setNombre(fila[0]);
                miPersona.setEdad(Integer.valueOf(fila[1]));
                miPersona.setPoblacion(fila[2]);
                miPersona.setEstudios(fila[3]);
                listaPersonas.add(miPersona);
                linea = datos.readLine();
            }
            datos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    // guarda los datos introducidos en el array
    public void guardarArray(String nom, int ed, String pobl, String estud) {
        Persona listapersona = new Persona();
        
        listapersona.setNombre(nom);
        listapersona.setEdad(ed);
        listapersona.setPoblacion(pobl);
        listapersona.setEstudios(estud);
        this.listaPersonas.add(listapersona);
    }
    
    // Escribe en el fichero de texto
    public void escribirDatos() {
        try {
            FileWriter ficheroEscribir = new FileWriter("C:\\Users\\Usuario\\Desktop\\ADRIAN\\INFORMATICA\\DAW2\\SerjioJava\\DatosImportantes.txt");
            BufferedWriter datosEscribir = new BufferedWriter(ficheroEscribir);
            
            for(Persona miPersona:listaPersonas) {
                datosEscribir.write(miPersona.toString());
                datosEscribir.newLine();
            }
            datosEscribir.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar");
        }
    }
    
    // recorre el array y muestra los datos
    public String mostrarDatos() {
        String texto = "";
        for(Persona miPersona:listaPersonas) {
            texto = texto + miPersona.toString() + "<br>";
        }
        return texto;
        //this.TextArea.setText(texto);
    }
}
