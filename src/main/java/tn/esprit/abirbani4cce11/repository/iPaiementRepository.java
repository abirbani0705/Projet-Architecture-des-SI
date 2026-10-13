package tn.esprit.abirbani4cce11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.abirbani4cce11.domain.Paiement;

public interface iPaiementRepository extends JpaRepository<Paiement, Long> {
}
