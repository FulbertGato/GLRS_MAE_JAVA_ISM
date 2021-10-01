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
public class Etudiant extends User{
  private String tuteur;
  private String matricule;
  private final String ROLE ="ROLE_ETUDIANT";

    public Etudiant() {
        this.role= ROLE;
    }


    public Etudiant(String tuteur, String matricule, int id, String nom_complet) {
        super(id, nom_complet);
        this.tuteur = tuteur;
        this.matricule = matricule;
        this.role=ROLE;
    }

    public Etudiant(String tuteur, String matricule, String nom_complet) {
        super(nom_complet);
        this.tuteur = tuteur;
        this.matricule = matricule;
        this.role=ROLE;
    }

    
  
    
}
