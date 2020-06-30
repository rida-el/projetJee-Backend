package org.sid.gestiondesprojets.controller;


import org.sid.gestiondesprojets.dao.ChefProjetRepository;
import org.sid.gestiondesprojets.dao.CollaborateurRepository;
import org.sid.gestiondesprojets.dao.GestionnaireProjetRepository;
import org.sid.gestiondesprojets.dao.MissionRepository;
import org.sid.gestiondesprojets.entitis.ChefProjet;
import org.sid.gestiondesprojets.entitis.Collaborateur;
import org.sid.gestiondesprojets.entitis.GestionnaireProjet;
import org.sid.gestiondesprojets.entitis.Mission;
import org.sid.gestiondesprojets.models.Collab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class CollabRestService {
    @Autowired
    private MissionRepository missionRepository;
    @Autowired
    private CollaborateurRepository collaborateurRepository;

    @Autowired
    private ChefProjetRepository chefProjetRepository;

    @Autowired
    private GestionnaireProjetRepository gestionnaireProjetRepository;



  /* @PostMapping(path = "/collaborateurs/addGestionnaire/{id}")
   public Collaborateur addGestionnaire(@PathVariable("id") String id,
                                   @RequestBody GestionnaireProjet gestionnaireProjet) throws Exception {

        Mission m = missionRepository.findByObjectif(id);
       gestionnaireProjet.setMission(m);
        return gestionnaireProjetRepository.save(gestionnaireProjet);
    }
*/


}
