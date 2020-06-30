package org.sid.gestiondesprojets.dao;

import org.sid.gestiondesprojets.entitis.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface MissionRepository extends JpaRepository<Mission,Long> {


    @RestResource(path = "/getObjectif")
    public Mission findByObjectif(String titre);



    @RestResource(path="/missionByIdColl")
    @Query("select m from Mission m where m.id like :x")
    public List<Mission> findByIdColl(@Param("x")Long x);

}
