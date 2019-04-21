/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Soleqsegongrauincompleta1;
import model.Soleqsegongrauincompleta2;

/**
 *
 * @author Usuario
 */
public class EquSegonController extends HttpServlet {

    

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String a = request.getParameter("coeficiente1");
        String b = request.getParameter("coeficiente2");
        String c = request.getParameter("coeficiente3");
        double a1 = Double.valueOf(a);
        double b1 = Double.valueOf(b);
        double c1 = Double.valueOf(c);
        
        Soleqsegongrauincompleta1 miecu1 = new Soleqsegongrauincompleta1(a1, b1, 0);
        Soleqsegongrauincompleta2 miecu2 = new Soleqsegongrauincompleta2(a1, 0, c1);
        miecu1.equsegongrauincompleta1(a1, b1);
        miecu2.equsegongrauincompleta2(a1, c1);
        
        request.setAttribute("num1", a1);
        request.setAttribute("num2", b1);
        request.setAttribute("num3", c1);
        
        request.setAttribute("miecu1", miecu1);
        request.setAttribute("miecu2", miecu2);
        try {
            request.getRequestDispatcher("resultats.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(EquSegonController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EquSegonController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
