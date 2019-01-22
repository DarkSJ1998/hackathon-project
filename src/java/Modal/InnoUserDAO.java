/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.*;

/**
 *
 * @author NIKHIL-PC
 */
public class InnoUserDAO {
 
    public boolean save(InnoUser i) {
    
        boolean flag = false;
        
        return flag;
    }
    
    public boolean checkUser(InnoUser iu) {
    
        boolean flag = false;
        
        String url = "jdbc:mysql://localhost:3306/hackproject?user=root&password=password&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
//        
       // System.out.println(uname+" "+pwd);

//        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
//
            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            String query="select * from inno where email='"+iu.getEmail()+"' and pwd='"+iu.getPwd()+"'";
            
            //System.out.println(query);
            
            int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                 c++;  //System.out.println(c); 
            }
            
            if(c > 0) {
               //out.println("true");
                flag = true;
            }
            
            else {
               // System.out.println("false");
                flag = false;
            }
           
            con.close();
        }   
        
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            //System.out.println(e);
        }
        return flag;
    }
}
