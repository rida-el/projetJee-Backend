package org.sid.gestiondesprojets.entitis;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "profil")

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Collaborateur implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String tel;

    @OneToMany(mappedBy = "collaborateur")
    private Collection<Mission> mission;
    @OneToMany(mappedBy = "collaborateur")
    private Collection<ProjetCollab> projetCollab;
    @Column(insertable=false,updatable=false)
    private String profil;




}
