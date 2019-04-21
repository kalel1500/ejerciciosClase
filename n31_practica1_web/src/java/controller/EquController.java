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
import model.Soleqsegongraucompl;

/**
 *
 * @author Usuario
 */
public class EquController extends HttpServlet {
    
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
        String a = request.getParameter("coeficiente1");
        String b = request.getParameter("coeficiente2");
        String c = request.getParameter("coeficiente3");
        double a1 = Double.valueOf(a);
        double b1 = Double.valueOf(b);
        double c1 = Double.valueOf(c);
        Soleqsegongraucompl miecu = new Soleqsegongraucompl();
        miecu.eqsegongraucompl(a1, b1, c1);
        // ENVIAR---------------------------------------------------
        // enviar al jsp SIN CLASE
        /*request.setAttribute("numerosoluciones", miecu.getNumsolu());
        request.setAttribute("sol1", miecu.getSol1());
        request.setAttribute("sol2", miecu.getSol2());*/
        // enviar al jsp CON CLASE
        request.setAttribute("miecu", miecu);
        request.getRequestDispatcher("recibir.jsp").forward(request, response);
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
