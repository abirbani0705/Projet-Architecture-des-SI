package tn.esprit.abirbani4cce11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.abirbani4cce11.domain.Client;

public interface iClientRepository extends JpaRepository<Client, Long> {
}
