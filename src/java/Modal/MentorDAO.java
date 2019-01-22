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
public class MentorDAO {
    
    public boolean save(Mentor m) {
    
        boolean flag = false;
        
        String url = "jdbc:mysql://localhost:3306/hackproject?user=root&password=password&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            String query="insert into mentor values(?,?,?,?,?,?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setString(1,m.getFname());
            
            pstmt.setString(2,m.getLname());
            
            pstmt.setString(3,m.getEmail());
            
            pstmt.setString(4,m.getLpro());
            
            pstmt.setString(5,m.getMno());
            
            pstmt.setString(6,m.getCorp());
            
            int i = pstmt.executeUpdate();
            
            if(i != 0) {
                flag = true;
            }
           
            con.close();
           
        }
        catch(Exception e) {
            System.out.println(e);
            flag = false;
            
        }
        
        return flag;
    }
    
    public ArrayList<Mentor> allMentors(String corp) {
    
        ArrayList<Mentor> arrmentor = new ArrayList<>();
        
        String url = "jdbc:mysql://localhost:3306/hackproject?user=root&password=password&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            Statement stmt=con.createStatement();
            
            String query="select fname from mentor where corp='"+corp+"'";
            
            //int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
           
            
            while(rs.next())
            {
                Mentor p = new Mentor();
                
                p.setFname(rs.getString(1));
                
                arrmentor.add(p);
                
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            //flag = false;
            
        }
        
        return arrmentor;
    }
    
}
