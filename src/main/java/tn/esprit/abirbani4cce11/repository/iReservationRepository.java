package tn.esprit.abirbani4cce11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.abirbani4cce11.domain.Reservation;

public interface iReservationRepository extends JpaRepository<Reservation, Long> {
}
