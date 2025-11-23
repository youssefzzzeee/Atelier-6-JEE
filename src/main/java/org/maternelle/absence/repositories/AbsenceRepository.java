package org.maternelle.absence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.maternelle.absence.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
}