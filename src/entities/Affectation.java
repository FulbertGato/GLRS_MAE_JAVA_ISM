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
public class Affectation {
    private String annee;
    private int id;
    private int profId;
    private int classeId;

    public Affectation() {
    }

    public Affectation(String annee, int profId, int classeId) {
        this.annee = annee;
        this.profId = profId;
        this.classeId = classeId;
    }

    public Affectation(String annee, int id, int prof_id, int classeId) {
        this.annee = annee;
        this.id = id;
        this.profId = prof_id;
        this.classeId = classeId;
    }
    
    

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public int getClasseId() {
        return classeId;
    }

    public void setClasseId(int classeId) {
        this.classeId = classeId;
    }
    

 
    
    
}
