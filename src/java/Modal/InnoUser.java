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
public class InnoUser {
    
    private String email;
    
    private String name;
    
    private String mno;
    
    private String pwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public InnoUser(String email, String name, String mno, String pwd) {
        this.email = email;
        this.name = name;
        this.mno = mno;
        this.pwd = pwd;
    }
    
    public InnoUser() {}
}
