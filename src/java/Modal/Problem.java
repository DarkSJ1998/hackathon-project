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
public class Problem {
    
    private String corp;
    
    private String inno;
    
    private String mentor;
    
    private boolean status;
    
    private String problem;

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getInno() {
        return inno;
    }

    public void setInno(String inno) {
        this.inno = inno;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Problem(String corp, String inno, String mentor, boolean status,String problem) {
        this.corp = corp;
        this.inno = inno;
        this.mentor = mentor;
        this.status = status;
        this.problem = problem;
    }
    
    public Problem() {}
}
