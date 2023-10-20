/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.Ingredientesdao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import model.Ingredientes;

/**
 *
 * @author Usuario
 */
@WebServlet("/ingresarIngrediente")
public class formularioIngredientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private final Ingredientesdao ingredientesdao = new Ingredientesdao(); 

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet formularioIngredientes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet formularioIngredientes at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        response.getWriter().append("server at: ").append(request.getContextPath());
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/form_ingredientes.jsp");
        dispatcher.forward(request, response);               
        
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
        
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String cantidad = request.getParameter("cantidad");
        String unidad = request.getParameter("unidad");
        
        Ingredientes ingredientes = new Ingredientes();
        ingredientes.setId(id);
        ingredientes.setNombre(nombre);
        ingredientes.setCantidad(cantidad);
        ingredientes.setUnidad(unidad);
        
        try { 
            ingredientesdao.ingresarIngredientes(ingredientes);
        } catch (ClassNotFoundException e) {
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/detalleingredientes.jsp");
        dispatcher.forward(request, response);     
        
        
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
