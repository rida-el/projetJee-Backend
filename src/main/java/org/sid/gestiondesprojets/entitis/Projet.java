package org.sid.gestiondesprojets.entitis;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Projet implements Serializable {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    private String budget;
    @Temporal(TemporalType.DATE)
    private Date date_livraison;
    private int nbTache;
    @OneToMany(mappedBy = "projet")
    private Collection<ProjetCollab> projetCollabs;

}