package controller;

import model.Utilisateur;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UtilisateurService;

import javax.validation.Valid;

@Controller
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    private static final Logger logger = Logger.getLogger(Utilisateur.class);

    @GetMapping("/listeUtilisateur")
    public String listeUtilisateur(Utilisateur utilisateur, Model model) {
        model.addAttribute("allUtilisateur", utilisateurService.getAll());
        return "listeUtilisateur";
    }

    @PostMapping(value = "/listeUtilisateur")
    public String checkUtilisateurInfo(@Valid final Utilisateur utilisateur, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "listeUtilisateur";
        }
        utilisateurService.create(utilisateur);
        logger.info(utilisateur.toString());
        model.clear();
        return "redirect:/listeUtilisateur";
    }

    @PostMapping(value = "/modifierUtilisateur")
    public String modifierUtilisateur(@Valid final Utilisateur utilisateur, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "afficherUtilisateur";
        }
        logger.info(utilisateur.toString());
        utilisateurService.update(utilisateur);
        return "redirect:/listeUtilisateur";
    }

    @GetMapping("/afficherUtilisateur")
    public String afficherUtilisateur(@RequestParam("id") String id, Utilisateur utilisateur, Model model) {
        logger.info(id);
        utilisateur = (Utilisateur) utilisateurService.get(id);
        logger.info(utilisateur.toString());
        model.addAttribute("utilisateur", utilisateur);
        return "afficherUtilisateur";
    }
}
