/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author NIKHIL-PC
 */
public class Mentor {
    
    private String fname;
    
    private String lname;
    
    private String email;
    
    private String lpro;
    
    private String mno;
    
    private String corp;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLpro() {
        return lpro;
    }

    public void setLpro(String lpro) {
        this.lpro = lpro;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public Mentor(String fname, String lname, String email, String lpro, String mno, String corp) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.lpro = lpro;
        this.mno = mno;
        this.corp = corp;
    }
    
    public Mentor() {}
    
}
