package org.sid.gestiondesprojets.entitis;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Mission  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String titre;
    private String objectif;
    private String responsable;
    @ManyToOne
    private Collaborateur collaborateur;

}
