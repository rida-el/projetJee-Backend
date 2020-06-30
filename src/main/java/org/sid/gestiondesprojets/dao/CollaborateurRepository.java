package org.sid.gestiondesprojets.dao;

import org.sid.gestiondesprojets.entitis.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface CollaborateurRepository
        extends JpaRepository<Collaborateur,Long> {


    @Query("select c from Collaborateur c where c.id =?1")
    public Collaborateur findByIdone(Long n);


    @Query(nativeQuery = true, value = "select c.nom , c.email , c.tel , c.profil from Collaborateur c ,Projet p , Projet_collab pc where p.id=?1 and p.id=pc.projet_id and pc.collaborateur_id = c.id")
    public List<Object[]> findByProjet(long n);


    @Query(nativeQuery = true, value = "select p.intitule , pc.vht from Projet p , Projet_collab pc , Collaborateur c where c.id=?1 and c.id=pc.collaborateur_id and pc.projet_id = p.id")
    public List<Object[]> findByCollab(long n);


    @Query(nativeQuery = true, value = "select sum(pc.vht) from Projet_collab pc , Collaborateur c where c.id=?1 and c.id=pc.collaborateur_id ")
    public List<Object[]> findByVht(long n);


}
