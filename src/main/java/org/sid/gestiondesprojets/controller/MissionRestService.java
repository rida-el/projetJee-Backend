package org.sid.gestiondesprojets.controller;


import org.sid.gestiondesprojets.dao.CollaborateurRepository;
import org.sid.gestiondesprojets.dao.MissionRepository;
import org.sid.gestiondesprojets.entitis.Collaborateur;
import org.sid.gestiondesprojets.entitis.Mission;
import org.sid.gestiondesprojets.models.Collab;
import org.sid.gestiondesprojets.models.Missionmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;


@CrossOrigin("*")
@RestController
public class MissionRestService {



    @Autowired
    private CollaborateurRepository collaborateurRepository;
    @Autowired
    private MissionRepository missionRepository;

    @PostMapping(path = "/missions/add")
    public void AffecterCollabMission(@RequestBody Missionmodel mc){
        Mission m = new Mission();
        m.setTitre(mc.getTitre());
        m.setObjectif(mc.getObjectif());
        m.setResponsable(mc.getResponsable());
        Long c1 = mc.getCollab();
        Collaborateur c = collaborateurRepository.findByIdone(c1);
        m.setCollaborateur(c);
        missionRepository.save(m);


    }


}
