package org.sid.gestiondesprojets.dao;

import org.hibernate.annotations.NamedQuery;
import org.sid.gestiondesprojets.entitis.Collaborateur;
import org.sid.gestiondesprojets.entitis.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProjetRepository extends JpaRepository<Projet,Long> {


    @Query("select p from Projet p where p.id =?1")
    public Projet findByIdone(Long n);


    @Query("select p.intitule , p.budget from Projet p ")
    public List<Object[]> findByProjet();



}
