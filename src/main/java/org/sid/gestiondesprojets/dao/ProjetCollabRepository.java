package org.sid.gestiondesprojets.dao;

import org.sid.gestiondesprojets.entitis.ProjetCollab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RepositoryRestResource
public interface ProjetCollabRepository extends JpaRepository<ProjetCollab,Long> {
}
