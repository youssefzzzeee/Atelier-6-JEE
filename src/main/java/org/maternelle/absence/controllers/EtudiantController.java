package org.maternelle.absence.controllers;

import org.maternelle.absence.entities.Etudiant;
import org.maternelle.absence.services.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private IEtudiantService etudiantService;

    // Afficher la liste
    @GetMapping
    public String listEtudiants(Model model) {
        model.addAttribute("listEtudiants", etudiantService.getAllEtudiants());
        return "etudiants"; // Nom du template Thymeleaf
    }

    // Afficher le formulaire d'ajout
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "form_etudiant";
    }

    // Sauvegarder
    @PostMapping("/save")
    public String saveEtudiant(@ModelAttribute("etudiant") Etudiant etudiant) {
        etudiantService.saveEtudiant(etudiant);
        return "redirect:/etudiants";
    }

    // Supprimer
    @GetMapping("/delete/{id}")
    public String deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
        return "redirect:/etudiants";
    }
}