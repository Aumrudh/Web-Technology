/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Web-Tech-Lab
 */
public class Header_Demo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Header_Demo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='1'>"+
                    "<tr><th align='right'>Client IP address : </th><td>"+request.getRemoteAddr()+"</td></th>"
                    +"<tr><th align='right'>Client Host Name : </th><td>"+request.getRemoteHost()+"</td></th>"
                    +"<tr><th align='right'>HTTP PROTOCOL : </th><td>"+request.getProtocol()+"</td></th>"
                    +"<tr><th align='right'>SECURE CHANNEL : </th><td>"+request.isSecure()+"</td></th>"
                    +"<tr><th align='right'>Request URL :  : </th><td>"+request.getRequestURL()+"</td></th>"
                    +"</table>"
            );
            String hN;
            String hV;
            Enumeration hNS=request.getHeaderNames();
            if(hNS==null){
                out.println("<p style='color:red'>cannot access header</p>");
                
            }
            else{
                out.println("<table border='1'>"+
                        "<caption>HTTP Header x`</caption>"+
                        "<tr><th>Name</th><th>Value</th></tr>");
                while(hNS.hasMoreElements()){
                    hN=(String)hNS.nextElement();
                    hV=request.getHeader(hN);
                    out.println("<tr><td>"+hN+"</td>"+
                    "<td>"+hV+"</td></tr>"                            
                    );
                }
               
        }
            //out.println("<h1>Servlet Header_Demo at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
