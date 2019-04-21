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
import model.Persona;

/**
 *
 * @author Usuario
 */
public class formController extends HttpServlet {

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
        int contador = Integer.valueOf(request.getParameter("contador"));
        String nombre = request.getParameter("nombre");
        int numeroHijos = Integer.valueOf(request.getParameter("numeroHijos"));
        String telefono = request.getParameter("telefono");
        String nombreHijo1 = request.getParameter("nombreHijo1");
        String nombreHijo2 = request.getParameter("nombreHijo2");
        String cuentaBancarea = request.getParameter("cuentaBancarea");
        String titulacion = request.getParameter("titulacion");
        int edad = Integer.valueOf(request.getParameter("edad"));
        int sueldo = Integer.valueOf(request.getParameter("sueldo"));
        
        Persona persona = new Persona(contador, nombre, numeroHijos, telefono, nombreHijo1, nombreHijo2, cuentaBancarea, titulacion, edad, sueldo);
        
        request.setAttribute("personajsp", persona);
        
        request.getRequestDispatcher("vista.jsp").forward(request, response);
    }

}
