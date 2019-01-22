<%-- 
    Document   : statuscorp
    Created on : Jan 22, 2019, 12:30:13 PM
    Author     : shobhit
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Status</title>
    </head>
    <body>
          <form action = "">
           <select>
               <%
                   ArrayList<Problem> arrpro = request.getSession().getAttribute("arrpro");
                   ArrayList<Mentor> arrmentor = request.getSession().getAttribute("arrmentor");
                   for(Problem p: arrpro){  
                   
                %>
                   <option value="<%=p.getProblem() %>">
                       <% }
                           %>
           </select>
           <select>
               <% 
                for(Mentor m: arrmentor){
                    
                   %>
                   <option value="<%=m.getFname() %>">
                       <% }
                           %>
           </select>
          
        </form>
    </body>
</html>
