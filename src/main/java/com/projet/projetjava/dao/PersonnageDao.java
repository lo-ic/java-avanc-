package com.projet.projetjava.dao;

import com.projet.projetjava.model.Personnage;

import java.util.List;

public interface PersonnageDao {
    public List<Personnage>findAll();
    public Personnage PersonnagefindById(int id);
    public Personnage Personnagesave(Personnage personnage);
}
