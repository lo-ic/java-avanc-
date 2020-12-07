package com.projet.projetjava.web.controller;
import com.projet.projetjava.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listOflist(){
        return "Une liste";
    }

    @GetMapping(value = "/list/{id}")
    public Product afficherLiseID(@PathVariable int id){
        Product product=new Product(id, new String("The One"), 100);
        return product;
    }
}

