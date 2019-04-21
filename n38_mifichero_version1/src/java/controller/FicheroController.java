/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.Persona;

/**
 *
 * @author Usuario
 */
public class FicheroController extends HttpServlet {
    
    ArrayList <Persona> listaPersonas = new ArrayList <Persona>();
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            String nombre = request.getParameter("nombre");
            int edad = Integer.valueOf(request.getParameter("edad"));
            String poblacion = request.getParameter("poblaicon");
            String estudios = request.getParameter("estudios");
            
            guardarArray(nombre,edad,poblacion,estudios);
            escribirDatos();
            
            leerDatos();
            String texto =mostrarDatos();
            request.setAttribute("texto", texto);
            request.setAttribute("listaPersonas", listaPersonas);
            request.getRequestDispatcher("vista.jsp").forward(request, response);
        } catch (Exception e) {
            // response.sendRedirect("index.html");
            request.getRequestDispatcher("index.html").forward(request, response);
        }
        
    }
    
    // pone los campos a vacio
    private void refrescar() {
        
    }
    
    // lee del fichero de texto ficheroEscirbirAnimal.txt
    private void leerDatos() {
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
                miPersona.setPoblacion(fila[0]);
                miPersona.setEstudios(fila[0]);
                listaPersonas.add(miPersona);
                linea = datos.readLine();
            }
            datos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    // guarda los datos introducidos en el array
    private void guardarArray(String nom, int ed, String pobl, String estud) {
        Persona persona = new Persona();
        
        persona.setNombre(nom);
        persona.setEdad(ed);
        persona.setPoblacion(pobl);
        persona.setEstudios(estud);
        this.listaPersonas.add(persona);
    }
    
    // Escribe en el fichero de texto ficheroEscirbirAnimal.txt
    private void escribirDatos() {
        try {
            FileWriter ficheroEscribir = new FileWriter("C:\\Users\\Usuario\\Desktop\\ADRIAN\\INFORMATICA\\DAW2\\SerjioJava\\ficheroEscribirAnimal.txt");
            BufferedWriter datosEscribir = new BufferedWriter(ficheroEscribir);
            // recorrer ArrayList
            // escribir en fichero
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
    private String mostrarDatos() {
        String texto = "";
        for(Persona miPersona:listaPersonas) {
            texto = texto + miPersona.toString() + "\n";
        }
        return texto;
        //this.TextArea.setText(texto);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
