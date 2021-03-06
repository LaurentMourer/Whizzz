package controller;

import model.Bonlivraison;
import model.Entitedesign;
import model.Entitefichier;
import model.Entitesql;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.BonlivraisonService;
import service.DomaineService;
import service.EnvironnementService;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class BonlivraisonController {

    private final BonlivraisonService bonlivraisonService;

    private final DomaineService domaineService;

    private final EnvironnementService environnementService;

    private static final Logger logger = Logger.getLogger(BonlivraisonController.class);

    @Autowired
    public BonlivraisonController(EnvironnementService environnementService, DomaineService domaineService, BonlivraisonService bonlivraisonService) {
        super();
        this.environnementService = environnementService;
        this.domaineService = domaineService;
        this.bonlivraisonService = bonlivraisonService;
    }

    @GetMapping("/listeBonLivraison")
    public String listeBonLivraison(@RequestParam(required = false) Date date, Bonlivraison bonlivraison, Model model) {
        long debut = System.currentTimeMillis();
        List<Date> setDate = bonlivraisonService.getDateBl();
        if (date == null) {
            date = setDate.get(0);
        }
        model.addAttribute("dateBl", setDate);
        model.addAttribute("allBonLivraison", bonlivraisonService.getBonLivraisonByDate(date));
        model.addAttribute("allDomaines", domaineService.getAll());
        model.addAttribute("allSources", environnementService.getAll());
        logger.info(System.currentTimeMillis() - debut);
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
    public String afficherBonLivraison(@RequestParam("id") String id, Model model) {
        logger.info(id);
        Bonlivraison bonlivraison = (Bonlivraison) bonlivraisonService.get(id);
        logger.info(bonlivraison.toString());
        model.addAttribute("allDomaines", domaineService.getAll());
        model.addAttribute("allSources", environnementService.getAll());
        model.addAttribute("bonlivraison", bonlivraison);
        return "afficherBonLivraison";
    }

    @GetMapping("/listeEntite")
    public String listeEntite(@RequestParam("id") String id, Entitedesign entitedesign, Entitefichier entitefichier, Entitesql entitesql, Model model) {
        long debut = System.currentTimeMillis();
        model.addAttribute("bonLivraison", bonlivraisonService.get(id));
        logger.info(System.currentTimeMillis() - debut);
        return "listeEntite";
    }


}
