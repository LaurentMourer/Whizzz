package controller;

import model.Bonlivraison;
import model.Domaine;
import model.Environnement;

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

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

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


    @ModelAttribute("allBonLivraison")
    public List<Bonlivraison> populateBonLivraison() {
        return bonlivraisonService.getAll();
    }

    @ModelAttribute("allDomaines")
    public List<Domaine> populateDomaines() {
        return domaineService.getAll();
    }


    @ModelAttribute("allSources")
    public List<Environnement> populateSources() {
        return environnementService.getAll();
    }


    @RequestMapping("/seedstartermng")
    public String showSeedstarters() {
        return "/seedstartermng";
    }

    // Login form
    @RequestMapping("/login")
    public String login() {
        return "/login";
    }

    // Login form with error
    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "/login";
    }

    @GetMapping("/creerBonLivraison")
    public String creerBonLivraison(Bonlivraison bonlivraison) {
        return "creerBonLivraison";
    }

    @PostMapping(value = "/creerBonLivraison")
    public String checkBonLivraisonInfo(@Valid final Bonlivraison bonlivraison, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "creerBonLivraison";
        }
        logger.info(bonlivraison.toString());
        model.clear();
        return "redirect:/seedstartermng";

    }


}
