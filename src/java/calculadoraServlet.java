/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Junior Santos
 */
@WebServlet(urlPatterns = {"/servlet-calculadora"})
public class calculadoraServlet extends HttpServlet {

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

        String valor1 = request.getParameter("valor1");
        String valor2 = request.getParameter("valor2");
        String operacao = request.getParameter("operacao");
        Float valor1_float = Float.parseFloat(valor1);
        Float valor2_float = Float.parseFloat(valor2);

        switch(operacao) {
            case "soma":              
                
                request.setAttribute("resultado", valor1_float + valor2_float);
                break;
            case "subtrair":
                request.setAttribute("resultado", valor1_float - valor2_float);
                break;
            case "dividir":
                request.setAttribute("resultado", valor1_float / valor2_float);
                break;
            case "multiplicar":
                request.setAttribute("resultado", valor1_float * valor2_float);
                break;
        }

        System.out.println("O valor do primeiro campo é: " + valor1);
        System.out.println("O valor do segundo campo é: " + valor2);

        request
                .getRequestDispatcher("/WEB-INF/form-calculadora.jsp")
                .forward(request, response);
    }

}
