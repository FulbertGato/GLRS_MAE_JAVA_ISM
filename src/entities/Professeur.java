/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author junio
 */
public class Professeur extends User{
    private String nci;
    private String grade;
    private final String ROLE ="ROLE_PROFESSEUR";

    public Professeur() {
        this.role= ROLE;
    }

    public Professeur(String nci, String grade, int id, String nom_complet) {
        super(id, nom_complet);
        this.nci = nci;
        this.grade = grade;
         this.role= ROLE;
    }

    public Professeur(String nci, String grade, String nom_complet) {
        super(nom_complet);
        this.nci = nci;
        this.grade = grade;
         this.role= ROLE;
    }
    
    
    
    

    public String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
}
