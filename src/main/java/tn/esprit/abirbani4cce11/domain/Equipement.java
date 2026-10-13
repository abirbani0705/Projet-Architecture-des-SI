package tn.esprit.abirbani4cce11.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    @Entity
    public class Equipement {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEquipement;
        private String libelle;
        @ManyToMany(mappedBy = "equipements")
        Set<Vehicule> vehicules = new HashSet<>();

}
