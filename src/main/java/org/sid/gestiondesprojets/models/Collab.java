package org.sid.gestiondesprojets.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data @NoArgsConstructor @AllArgsConstructor
public class Collab {

    private Long idCollab;
    private String nom;
    private String tel;
    private String email;
    private String competence;


}
