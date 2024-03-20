/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package jagg.clase10dia11ej1voto.servlets;

import jagg.clase10dia11ej1voto.logica.Controladora;
import jagg.clase10dia11ej1voto.logica.Voto;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JUNAN
 */
@WebServlet(name = "VotoSv", urlPatterns = {"/VotoSv"})
public class VotoSv extends HttpServlet {

    private Controladora control = new Controladora();

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
        // processRequest(request, response);
        System.out.println("Estoy en doget");
        List<Voto> votos = control.traerVotos();
        List<Voto> votosFiltrados = new ArrayList<>();
        for (Voto voto : votos) {
            String partido = voto.getPartido(); // Store the return value of getPartido()
            if (partido != null && (partido.equals("partidoA") || partido.equals("partidoB") || voto.getPartido().equals("partidoC"))) {
                votosFiltrados.add(voto);
            }
        }
        request.setAttribute("resultados", votosFiltrados);
        //request.setAttribute("resultados", votos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
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
        System.out.println("Estoy en dopost");
        String partido = request.getParameter("voto");
        Voto voto = new Voto(partido);
        control.crearVoto(voto);
        response.sendRedirect("index.jsp");
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
