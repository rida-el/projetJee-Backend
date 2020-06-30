package org.sid.gestiondesprojets.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Missionmodel {

    private String titre;
    private String responsable;
    private String objectif;
    private Long collab;
}
