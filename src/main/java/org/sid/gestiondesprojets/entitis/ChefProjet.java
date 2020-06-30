package org.sid.gestiondesprojets.entitis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@DiscriminatorValue("chefProjet")

@Data @AllArgsConstructor @NoArgsConstructor
public class ChefProjet extends Collaborateur implements Serializable  {

    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id ;
    private String competence ;




}
