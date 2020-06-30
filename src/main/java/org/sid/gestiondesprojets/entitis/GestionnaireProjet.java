package org.sid.gestiondesprojets.entitis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@DiscriminatorValue("gestionnaireProjet")
@Data @NoArgsConstructor @AllArgsConstructor
public class GestionnaireProjet extends Collaborateur implements Serializable {

    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    private int nbprojgere;


}
