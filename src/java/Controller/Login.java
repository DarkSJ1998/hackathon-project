/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.Corp;
import Modal.CorpDAO;
import Modal.InnoUser;
import Modal.InnoUserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sarthak Jain
 */
public class Login extends HttpServlet {

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
        System.out.println("LoginValid called.");
        PrintWriter out = response.getWriter();
        
        String uname = request.getParameter("email");
        
        String pwd = request.getParameter("pwd");
        
        String user = request.getParameter("user");
        
        if(user.equals("Innovator")) {
            System.out.println("Innovator");
            InnoUser ud = new InnoUser(); 
           
            ud.setEmail(uname);
            
            ud.setPwd(pwd);
            
            InnoUserDAO iu = new InnoUserDAO();
            
            if(iu.checkUser(ud)) {
            
              out.println("<script type=\"text/javascript\">");
              out.println("alert('Login Successfull!');");
              out.println("location='innoHome.jsp';");
              out.println("</script>");
            }
            else {
            
              out.println("<script type=\"text/javascript\">");
              out.println("alert('User or password incorrect');");
              out.println("location='login.jsp';");
              out.println("</script>");
            }
        } 
        
        else if(user.equals("Corporation")) {
            System.out.println("Corp");
            Corp ud = new Corp(); 
           
            ud.setEmail(uname);
            
            ud.setPwd(pwd);
            
            CorpDAO iu = new CorpDAO();
            
            if(iu.checkUser(ud)) {
            
              out.println("<script type=\"text/javascript\">");
              out.println("alert('Login Successfull!');");
              out.println("location='corpHome.jsp';");
              out.println("</script>");
              HttpSession session = request.getSession();
              session.setAttribute("corpname",iu.getName());
              session.setAttribute("corp",iu.getCorp());
            }
            else {
            
              out.println("<script type=\"text/javascript\">");
              out.println("alert('User or password incorrect');");
              out.println("location='login.jsp';");
              out.println("</script>");
            }
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
