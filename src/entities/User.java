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
public class User {
    protected int id;
    protected String nom_complet;
    protected String role;
    protected String login;
    protected String password;

    public User() {
    }

    public User(String nom_complet, String role, String login, String password) {
        this.nom_complet = nom_complet;
        this.role = role;
        this.login = login;
        this.password = password;
    }

    public User(int id, String nom_complet, String role, String login, String password) {
        this.id = id;
        this.nom_complet = nom_complet;
        this.role = role;
        this.login = login;
        this.password = password;
    }

    public User(int id, String nom_complet) {
        this.id = id;
        this.nom_complet = nom_complet;
    }

    public User(String nom_complet) {
        this.nom_complet = nom_complet;
    }
    

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_complet() {
        return nom_complet;
    }

    public void setNom_complet(String nom_complet) {
        this.nom_complet = nom_complet;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
