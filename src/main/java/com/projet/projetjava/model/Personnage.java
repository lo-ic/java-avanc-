package com.projet.projetjava.model;

import org.springframework.beans.factory.annotation.Qualifier;

public class Personnage {
    private int id;
    private String nom;
    private String type;


    public Personnage(){

    }

    public Personnage( int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
