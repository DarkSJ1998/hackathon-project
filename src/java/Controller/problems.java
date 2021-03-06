/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.Mentor;
import Modal.MentorDAO;
import Modal.Problem;
import Modal.ProblemDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NIKHIL-PC
 */
public class problems extends HttpServlet {

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
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        //MentorDAO ud = new MentorDAO();
        
        HttpSession session = request.getSession();
        
        String mentor = request.getSession().getAttribute("mentorname").toString();
        
        //ArrayList<Mentor> arrfpro = ud.allMentors(mentor);
        
        ProblemDAO pd = new ProblemDAO();
        
        ArrayList<Problem> arrfpro = pd.getFalseProblem(mentor);
      
            if(arrfpro.size() != 0) {
                
                session.setAttribute("arrfpro",arrfpro);
                //session.setAttribute("arrpro",arrpro);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Mentor added Successfull!');");
                out.println("location='acceptproblems.jsp';");
                out.println("</script>");
                
            }  
            
            else {
            
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Failed to add Mentor!');");
                out.println("location='innovator.jsp';");
                out.println("</script>"); 
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
