package com.projet.projetjava.dao;

import com.projet.projetjava.model.Personnage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonnageDaoImpl implements PersonnageDao {

    public static List<Personnage>personnages=new ArrayList<>();
    static {
        personnages.add(new Personnage(1, new String("The One"),"Guerrier"));
        personnages.add(new Personnage(2, new String("The Deuse"),"Mage"));
        personnages.add(new Personnage(3, new String("The Troisse"),"Guerrage"));

    }
    @Override
    public List<Personnage> findAll() {
        return personnages;
    }

    @Override
    public Personnage PersonnagefindById(int id) {
        for (Personnage personnage : personnages){
            if(personnage.getId() == id){
                return personnage;
            }
        }
        return null;
    }

    @Override
    public Personnage Personnagesave(Personnage personnage) {
        personnages.add(personnage);
        return personnage;

    }
}
