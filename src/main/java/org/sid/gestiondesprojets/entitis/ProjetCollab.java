package org.sid.gestiondesprojets.entitis;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class ProjetCollab  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Collaborateur collaborateur;
    @ManyToOne
    private Projet projet;
    private int vht;
}
