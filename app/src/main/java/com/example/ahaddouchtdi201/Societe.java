package com.example.ahaddouchtdi201;

import java.io.Serializable;

public class Societe  implements Serializable {
    int id;
    String nom;
    String Secteur;
    int nbEmploiye;

    public Societe() {
    }

    public Societe(int id, String nom, String secteur,int nbEmploiye) {
        this.id = id;
        this.nom = nom;
        Secteur = secteur;
        this.nbEmploiye=nbEmploiye;
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

    public int getNbEmploiye() {
        return nbEmploiye;
    }

    public void setNbEmploiye(int nbEmploiye) {
        this.nbEmploiye = nbEmploiye;
    }
}
