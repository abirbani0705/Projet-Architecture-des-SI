package tn.esprit.abirbani4cce11.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    @Entity
    public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idClient;
        private LocalDate dateInscription;
        private String nom;
        private String prenom;
        private String email;
        private String telephone;
        private String numPermis;
        @OneToMany(mappedBy = "client")
        private Set<Reservation> reservations = new HashSet<>();

}
