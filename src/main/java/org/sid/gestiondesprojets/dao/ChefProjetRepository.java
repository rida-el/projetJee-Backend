package org.sid.gestiondesprojets.dao;

import org.sid.gestiondesprojets.entitis.ChefProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("*")
public interface ChefProjetRepository extends JpaRepository<ChefProjet,Long> {

}
