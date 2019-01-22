/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sarthak Jain
 */
public class CorpDAO {
    String name;
    Corp s = new Corp();
    public boolean checkUser(Corp iu) {
    
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
            System.out.println("iu.getEmail() = " + iu.getEmail() + " iu.getPwd() = " + iu.getPwd());
            String query="select * from corp where email='"+iu.getEmail()+"' and pwd='"+iu.getPwd()+"'";
            
            //System.out.println(query);
            
            int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                s.setEmail(rs.getString(1));
                s.setName(rs.getString(2));
                s.setMobile(rs.getString(3));
                s.setAddress(rs.getString(5));
                name = rs.getString(2);
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
            System.out.println(e);
            flag = false;
            //System.out.println(e);
        }
        return flag;
    }
    public String getName()
    {
        return name;
    }
    public Corp getCorp()
    {
        return s;
    }
}
