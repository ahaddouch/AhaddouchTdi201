package com.example.ahaddouchtdi201;

import java.io.Serializable;

public class Societe  implements Serializable {
    int id;
    String nom;
    String Secteur;

    public Societe() {
    }

    public Societe(int id, String nom, String secteur) {
        this.id = id;
        this.nom = nom;
        Secteur = secteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSecteur() {
        return Secteur;
    }

    public void setSecteur(String secteur) {
        Secteur = secteur;
    }
}
