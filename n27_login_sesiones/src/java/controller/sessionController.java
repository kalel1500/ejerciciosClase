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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
public class sessionController extends HttpServlet {
    HttpSession misesion;

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
        // Inicialiciamos el usuario
        String miusuario = "adrian";
        String mipassword = "1234";
        // rescatar variables con el metodo getParameter
        String nombre = request.getParameter("nombre");
        String password = request.getParameter("password");
        
        if ((nombre.equals(miusuario)) && (password.equals(mipassword))) {
            // Inicio sesion
            misesion = request.getSession();
            // Poner valor a la sesion
            misesion.setAttribute("nombre", nombre);
            
        }
        
        // Enviar los daros a la vista
        request.getRequestDispatcher("vista.jsp").forward(request, response);
        
        
    }
}
