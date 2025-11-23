package org.maternelle.absence.services.impl;

import org.maternelle.absence.entities.Absence;
import org.maternelle.absence.repositories.AbsenceRepository;
import org.maternelle.absence.services.IAbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AbsenceServiceImpl implements IAbsenceService {

    @Autowired
    private AbsenceRepository absenceRepository;

    @Override
    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();
    }

    @Override
    public void saveAbsence(Absence absence) {
        absenceRepository.save(absence);
    }
}