package org.sid.gestiondesprojets.controller;


import org.sid.gestiondesprojets.dao.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ProjetRestService {


    @Autowired
    private ProjetRepository projetRepository;

    @GetMapping(value ="projets/findBudget")
    public List<Object[]> getVht(){
        return projetRepository.findByProjet();
    }
}
