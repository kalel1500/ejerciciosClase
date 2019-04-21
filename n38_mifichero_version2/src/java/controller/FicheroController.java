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
       
        //try {
            String nombre = request.getParameter("nombre");
            int edad = Integer.valueOf(request.getParameter("edad"));
            String poblacion = request.getParameter("poblacion");
            String estudios = request.getParameter("estudios");
            
            
            Persona myClase = new Persona();
            myClase.guardarArray(nombre,edad,poblacion,estudios);
            myClase.leerDatos();
            myClase.escribirDatos();
            
            String texto = myClase.mostrarDatos();
            
            request.setAttribute("texto", texto);
            request.getRequestDispatcher("vista.jsp").forward(request, response);
        //} catch (Exception e) {
            // response.sendRedirect("index.html");
        //    request.getRequestDispatcher("index.html").forward(request, response);
        //}
        
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
