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
public class Inscription {
    private String annee;
    private int id;
    private int etuId;
    private int classeId;

    public Inscription() {
    }

    public Inscription(String annee, int id, int etuId, int classeId) {
        this.annee = annee;
        this.id = id;
        this.etuId = etuId;
        this.classeId = classeId;
    }

    public Inscription(String annee, int etuId, int classeId) {
        this.annee = annee;
        this.etuId = etuId;
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

    public int getEtuId() {
        return etuId;
    }

    public void setEtuId(int etuId) {
        this.etuId = etuId;
    }

    public int getClasseId() {
        return classeId;
    }

    public void setClasseId(int classeId) {
        this.classeId = classeId;
    }
    
    
    

    }
    
    
    
