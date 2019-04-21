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

/**
 *
 * @author Usuario
 */
public class ControladorOperacion extends HttpServlet {

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
        String op = request.getParameter("op");
        int operacion = Integer.parseInt(op);
        
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        
        int resultado = 0;
        switch (operacion) {
            case 1 :
                resultado = numero1 + numero2;
            break;
            
            case 2 :
                resultado = numero1 - numero2;
            break;
            
            case 3 :
                resultado = numero1 * numero2;
            break;
            
            case 4 :
                if (numero2 == 0) {
                    resultado = 0;
                } else {
                    resultado = numero1 / numero2;
                }
                
            break;
        }
        
        request.setAttribute("resultado", resultado);
        request.setAttribute("numero2", numero2);
        request.setAttribute("operacion", operacion);
        
        request.getRequestDispatcher("vistaResultado.jsp").forward(request, response);
        
        
        /*if (operacion == 1) {
            response.sendRedirect("seleccionOperacion.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }*/
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
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
