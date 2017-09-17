package controller;

import model.Environnement;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.EnvironnementService;

import javax.validation.Valid;

@Controller
public class EnvironnementController {

    @Autowired
    private EnvironnementService environnementService;

    private static final Logger logger = Logger.getLogger(EnvironnementController.class);

    @GetMapping("/listeEnvironnement")
    public String listeEnvironnement(Environnement environnement, Model model) {

        model.addAttribute("allEnvironnement", environnementService.getAll());
        return "listeEnvironnement";
    }


    @PostMapping(value = "/listeEnvironnement")
    public String checkEnvironnementInfo(@Valid final Environnement environnement, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "listeEnvironnement";
        }
        environnementService.create(environnement);
        logger.info(environnement.toString());
        model.clear();
        return "redirect:/listeEnvironnement";

    }

    @PostMapping(value = "/modifierEnvironnement")
    public String modifierEnvironnement(@Valid final Environnement environnement, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "afficherEnvironnement";
        }
        environnementService.update(environnement);
        logger.info(environnement.toString());
        return "redirect:/listeEnvironnement";

    }

    @GetMapping("/afficherEnvironnement")
    public String afficherEnvironnement(@RequestParam("id") String id, Environnement environnement, Model model) {
        logger.info(id);
        environnement = (Environnement) environnementService.get(id);
        logger.info(environnement.toString());
        model.addAttribute("environnement", environnement);
        return "afficherEnvironnement";
    }
}
