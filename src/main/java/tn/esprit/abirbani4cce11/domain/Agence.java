package tn.esprit.abirbani4cce11.domain;

import jakarta.persistence.*;
import lombok.*;

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
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy="agences")
    private Set<Vehicule> vehicules = new HashSet<>();
    @OneToMany(mappedBy="agences")
    private Set<Employe> employes = new HashSet<>();

}
