package org.sid.gestiondesprojets.controller;


import org.sid.gestiondesprojets.dao.CollaborateurRepository;
import org.sid.gestiondesprojets.dao.ProjetCollabRepository;
import org.sid.gestiondesprojets.dao.ProjetRepository;
import org.sid.gestiondesprojets.entitis.Collaborateur;
import org.sid.gestiondesprojets.entitis.Projet;
import org.sid.gestiondesprojets.entitis.ProjetCollab;
import org.sid.gestiondesprojets.models.ProjetCollabmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ProjetCollabRestService {

    @Autowired
    private CollaborateurRepository collaborateurRepository;
    @Autowired
    private ProjetRepository projetRepository;
    @Autowired
    private ProjetCollabRepository projetCollabRepository;


    @PostMapping(path = "/projetCollabs/add")
    public void addProjetCollab (@RequestBody ProjetCollabmodel pcm){
       // Mission m = new Mission();
        ProjetCollab pc = new ProjetCollab();
        pc.setVht(pcm.getVht());
        Long p = pcm.getProjet();
        Long c = pcm.getCollab();
        Collaborateur c1 = collaborateurRepository.findByIdone(c);
        Projet p1 = projetRepository.findByIdone(p);
        pc.setCollaborateur(c1);
        pc.setProjet(p1);
        projetCollabRepository.save(pc);

    }

    @GetMapping(value="projets/findCollab/{id}")
    public List<Object[]> getCollab(@PathVariable Long id){
        return collaborateurRepository.findByProjet(id);
    }

    @GetMapping(value ="collaborateurs/findProjet/{id}")
    public List<Object[]> getProjet(@PathVariable Long id){
        return collaborateurRepository.findByCollab(id);
    }

    @GetMapping(value ="collaborateurs/findVht/{id}")
    public List<Object[]> getVht(@PathVariable Long id){
        return collaborateurRepository.findByVht(id);
    }

}
