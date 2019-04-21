/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
public class sessionController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String valor = request.getParameter("valor");
        /*JOptionPane.showMessageDialog(null,valor);*/
    }

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
        String name = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int edad = Integer.valueOf(request.getParameter("edad"));
        String password = request.getParameter("password");
        /*JOptionPane.showMessageDialog(null,name);*/
        
        /*Opcion 1*/
        request.setAttribute("namejsp", name);
        request.setAttribute("apellidojsp", apellido);
        request.setAttribute("edadjsp", edad);
        request.setAttribute("passjsp", password);
        
        /*Opcion 2
        Persona persona = new Persona();
        persona.setNombre(name);
        persona.setApellido(apellido);
        persona.setEdad(edad);*/
        
         /*Opcion 3*/
        Persona persona = new Persona(name, apellido, edad);
        
        request.setAttribute("personajsp", persona);
        
        request.getRequestDispatcher("vista.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

}
