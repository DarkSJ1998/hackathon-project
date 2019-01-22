/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NIKHIL-PC
 */
public class ProblemDAO {
    
    public ArrayList<Problem> getProblem(String corp,String status) {
    
        //boolean flag = false;
        ArrayList<Problem> arrpro = new ArrayList<>();
        
        String url = "jdbc:mysql://localhost:3306/hackproject?user=root&password=password&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            Statement stmt=con.createStatement();
            
            String query="select problem from prob where corp='"+corp+"' and status='false'";
            
            //int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
           
            
            while(rs.next())
            {
                Problem p = new Problem();
                
                p.setProblem(rs.getString(1));
                
                arrpro.add(p);
                
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            //flag = false;
            
        }
        
        return arrpro;
    }
    
    public ArrayList<Problem> getFalseProblem(String mentor) {
    
        ArrayList<Problem> arrfpro = new ArrayList<>();
        
        String url = "jdbc:mysql://localhost:3306/hackproject?user=root&password=password&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            Statement stmt=con.createStatement();
            
            String query="select problem from prob where mentor='"+mentor+"' and status='false'";
            
            //int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
           
            
            while(rs.next())
            {
                Problem p = new Problem();
                
                p.setProblem(rs.getString(1));
                
                arrfpro.add(p);
                
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            //flag = false;
            
        }
        
        return arrfpro;
    }
}
