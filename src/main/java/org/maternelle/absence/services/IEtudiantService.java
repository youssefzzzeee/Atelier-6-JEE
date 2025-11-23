package org.maternelle.absence.services;

import java.util.List;
import org.maternelle.absence.entities.Etudiant;

public interface IEtudiantService {
    List<Etudiant> getAllEtudiants();
    void saveEtudiant(Etudiant etudiant);
    Etudiant getEtudiantById(Long id);
    void deleteEtudiant(Long id);
}