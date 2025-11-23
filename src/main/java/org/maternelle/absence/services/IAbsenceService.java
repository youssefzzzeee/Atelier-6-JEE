package org.maternelle.absence.services;

import org.maternelle.absence.entities.Absence;
import java.util.List;

public interface IAbsenceService {
    List<Absence> getAllAbsences();
    void saveAbsence(Absence absence);
}