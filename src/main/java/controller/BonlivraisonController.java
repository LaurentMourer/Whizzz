package controller;

import model.Bonlivraison;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.BonlivraisonService;
import service.DomaineService;
import service.EnvironnementService;

import javax.validation.Valid;

@Controller
public class BonlivraisonController {


    @Autowired
    private BonlivraisonService bonlivraisonService;

    @Autowired
    private DomaineService domaineService;

    @Autowired
    private EnvironnementService environnementService;


    private static final Logger logger = Logger.getLogger(BonlivraisonController.class);

    public BonlivraisonController() {
        super();
    }

    @GetMapping("/listeBonLivraison")
    public String listeBonLivraison(Bonlivraison bonlivraison, Model model) {
        model.addAttribute("allBonLivraison", bonlivraisonService.getAll());
        model.addAttribute("allDomaines", domaineService.getAll());
        model.addAttribute("allSources", environnementService.getAll());
        return "listeBonLivraison";
    }


    @PostMapping(value = "/listeBonLivraison")
    public String checkBonLivraisonInfo(@Valid final Bonlivraison bonlivraison, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "listeBonLivraison";
        }
        logger.info(bonlivraison.toString());
        bonlivraisonService.create(bonlivraison);
        model.clear();
        return "redirect:/listeBonLivraison";
    }

    @PostMapping(value = "/modifierBl")
    public String modifierBl(@Valid final Bonlivraison bonlivraison, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "afficherBonLivraison";
        }
        logger.info(bonlivraison.toString());
        bonlivraisonService.update(bonlivraison);
        return "redirect:/listeBonLivraison";

    }

    @GetMapping("/afficherBonLivraison")
    public String afficherBonLivraison(@RequestParam("id") String id, Bonlivraison bonlivraison, Model model) {
        logger.info(id);
        bonlivraison = (Bonlivraison) bonlivraisonService.get(id);
        logger.info(bonlivraison.toString());
        model.addAttribute("allDomaines", domaineService.getAll());
        model.addAttribute("allSources", environnementService.getAll());
        model.addAttribute("bonlivraison", bonlivraison);
        return "afficherBonLivraison";
    }


}
