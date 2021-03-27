/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Web-Tech-Lab
 */
public class Sort extends HttpServlet {

  
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
           System.out.print("f");        
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
            response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Sort</title>");            
            out.println("</head>");
            out.println("<body>");         
            out.println("<p>" +"Sorterd numbers"+ "</p>");
            String val=request.getParameter("p");
            String arr[]=val.split(",",5);
            int mySorted[]=new int[5];
            for(int i=0;i<arr.length;i++){
                mySorted[i]=Integer.parseInt(arr[i]);               
                
            }
            for (int i = 0; i < mySorted.length; i++) {     
            for (int j = i+1; j < mySorted.length; j++) {     
               if(mySorted[i] > mySorted[j]) {    
                   int temp = mySorted[i];    
                   mySorted[i] = mySorted[j];    
                   mySorted[j] = temp;    
               }     
            }  
            }
            for ( int i = 0; i < mySorted.length; i++) { 
                out.println("<span>" +mySorted[i]+ "</span>");
            }
               System.out.print("f");
            out.println("</body>");
            out.println("</html>");
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
