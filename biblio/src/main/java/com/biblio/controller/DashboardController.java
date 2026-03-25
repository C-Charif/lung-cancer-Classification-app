package com.biblio.controller;

import com.biblio.model.Livre;
import com.biblio.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DashboardController {

    @Autowired
    private LivreRepository livreRepository;

    // Afficher le dashboard
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("livres", livreRepository.findAll());
        model.addAttribute("total", livreRepository.count());
        return "dashboard";
    }

    // Ajouter un livre
    @PostMapping("/dashboard/ajouter")
    public String ajouterLivre(@RequestParam String titre,
                               @RequestParam String auteur,
                               @RequestParam String isbn,
                               @RequestParam int annee) {
        Livre livre = new Livre();
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setIsbn(isbn);
        livre.setAnnee(annee);
        livreRepository.save(livre);
        return "redirect:/dashboard";
    }

    // Supprimer un livre
    @GetMapping("/dashboard/supprimer/{id}")
    public String supprimerLivre(@PathVariable Long id) {
        livreRepository.deleteById(id);
        return "redirect:/dashboard";
    }
}
