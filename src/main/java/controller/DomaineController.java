package controller;

import model.Domaine;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DomaineService;

import javax.validation.Valid;
import java.util.List;


@Controller
public class DomaineController {

    @Autowired
    private DomaineService domaineService;

    @ModelAttribute("allDomaine")
    public List<Domaine> populateDomaines() {
        return domaineService.getAll();
    }

    @GetMapping("/listeDomaine")
    public String listeDomaine(Domaine domaine) {
        return "listeDomaine";
    }

    private static final Logger logger = Logger.getLogger(DomaineController.class);

    @PostMapping(value = "/listeDomaine")
    public String checkDomaineInfo(@Valid final Domaine domaine, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "listeDomaine";
        }
        logger.info(domaine.toString());
        model.clear();
        return "redirect:/listeDomaine";

    }

    @PostMapping(value = "/modifierDomaine")
    public String modifierDomaine(@Valid final Domaine domaine, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "afficherDomaine";
        }
        logger.info(domaine.toString());
        return "redirect:/listeDomaine";

    }

    @GetMapping("/afficherDomaine")
    public String afficherDomaine(@RequestParam("id") Long id, Domaine domaine, Model model) {
        logger.info(id);
        domaine = domaineService.getDomaine(id);
        logger.info(domaine.toString());
        model.addAttribute("domaine", domaine);
        return "afficherDomaine";
    }
}