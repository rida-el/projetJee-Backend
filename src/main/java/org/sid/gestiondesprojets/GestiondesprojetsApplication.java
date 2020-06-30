package org.sid.gestiondesprojets;

import org.sid.gestiondesprojets.dao.ChefProjetRepository;
import org.sid.gestiondesprojets.dao.CollaborateurRepository;
import org.sid.gestiondesprojets.dao.GestionnaireProjetRepository;
import org.sid.gestiondesprojets.dao.MissionRepository;
import org.sid.gestiondesprojets.entitis.*;
import org.sid.gestiondesprojets.service.ICollabmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GestiondesprojetsApplication implements CommandLineRunner {

	@Autowired
	private ChefProjetRepository chefProjetRepository;
	private Collaborateur c;
	private ChefProjet ch = new ChefProjet();
	private GestionnaireProjet g = new GestionnaireProjet();
	@Autowired
	private MissionRepository missionRepository;
	@Autowired
	private CollaborateurRepository collaborateurRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

	@Autowired
	private GestionnaireProjetRepository gestionnaireProjetRepository;


	public static void main(String[] args) {
		SpringApplication.run(GestiondesprojetsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		restConfiguration.exposeIdsFor(ChefProjet.class,GestionnaireProjet.class,Mission.class, Projet.class,ProjetCollab.class);

		System.out.println("ruuuuun");
		//collabmissionservice.initMission();
		//collabmissionservice.initChefProjet();
		//collabmissionservice.initGestionnaire();
		//collabmissionservice.initProjet();
		//collabmissionservice.initProjetCollab();

	}
}
