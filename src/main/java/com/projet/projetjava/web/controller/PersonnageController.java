package com.projet.projetjava.web.controller;
import com.projet.projetjava.model.Personnage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.projet.projetjava.dao.PersonnageDao;

@RestController
public class PersonnageController {

    @Autowired
    private PersonnageDao personnageDao;


    //Liste Personnages
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Personnage>personnageList(){
        return personnageDao.findAll();
    }



    //Json Version
    @GetMapping(value = "/list/{id}")
    public Personnage afficherListePersonnage(@PathVariable int id){
        return personnageDao.PersonnagefindById(id);
    }
}

