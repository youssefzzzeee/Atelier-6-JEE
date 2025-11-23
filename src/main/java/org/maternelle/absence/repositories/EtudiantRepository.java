package org.maternelle.absence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.maternelle.absence.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}