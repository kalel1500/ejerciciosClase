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
public class CalcuController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //recupero los datos del formulario con el metodo getParameter del objeto request
            String numero1 = request.getParameter("num"); // num es el nombre del atributo name del input del formulario
            String numero2 = request.getParameter("num");
            double num3 = 0;
            //convierte los Strings a Doubles (en este caso) y asi se pueden sumar
            double dnumero1 = Double.parseDouble(numero1);
            double dnumero2 = Double.parseDouble(numero1);
            //operacion
            num3 = dnumero1+dnumero2;
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcuController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + num3 + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
