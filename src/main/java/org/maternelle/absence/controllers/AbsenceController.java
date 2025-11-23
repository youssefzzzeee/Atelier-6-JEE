package org.maternelle.absence.controllers;

import org.maternelle.absence.entities.Absence;
import org.maternelle.absence.services.IAbsenceService;
import org.maternelle.absence.services.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AbsenceController {

    @Autowired
    private IAbsenceService absenceService;

    @Autowired
    private IEtudiantService etudiantService; // Needed for the dropdown list

    @GetMapping
    public String listAbsences(Model model) {
        model.addAttribute("listAbsences", absenceService.getAllAbsences());
        return "absences";
    }

    @GetMapping("/new")
    public String formAbsence(Model model) {
        model.addAttribute("absence", new Absence());
        // We send the list of students to select who is absent
        model.addAttribute("etudiants", etudiantService.getAllEtudiants());
        return "form_absence";
    }

    @PostMapping("/save")
    public String saveAbsence(@ModelAttribute("absence") Absence absence) {
        absenceService.saveAbsence(absence);
        return "redirect:/absences";
    }
}