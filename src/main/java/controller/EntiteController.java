package controller;

import model.Entiteaction;
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
import service.EntiteFichierService;
import service.EntiteSqlService;
import service.EntitedesignService;

import javax.validation.Valid;

@Controller
public class EntiteController {

    private final EntitedesignService entitedesignService;
    private final EntiteFichierService entiteFichierService;
    private final EntiteSqlService entiteSqlService;

    private static final Logger logger = Logger.getLogger(EntiteController.class);

    @Autowired
    public EntiteController(EntiteSqlService entiteSqlService, EntiteFichierService entiteFichierService, EntitedesignService entitedesignService) {
        super();
        this.entiteSqlService = entiteSqlService;
        this.entiteFichierService = entiteFichierService;
        this.entitedesignService = entitedesignService;
    }

    @PostMapping(value = "/creerEntiteDesign")
    public String checkEntiteDesign(@Valid final Entitedesign entitedesign, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "listeEntite";
        }
        logger.info(entitedesign.toString());
        entitedesignService.create(entitedesign);
        model.clear();
        return "redirect:/listeEntite";
    }

    @PostMapping(value = "/creerEntiteFichier")
    public String checkEntiteFichier(@Valid final Entitefichier entitefichier, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "listeEntite";
        }
        logger.info(entitefichier.toString());
        entiteFichierService.create(entitefichier);
        model.clear();
        return "redirect:/listeEntite";
    }

    @PostMapping(value = "/creerEntiteSql")
    public String checkEntiteSql(@Valid final Entitesql entitesql, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "listeEntite";
        }
        logger.info(entitesql.toString());
        entiteSqlService.create(entitesql);
        model.clear();
        return "redirect:/listeEntite";
    }

    @GetMapping("/listeaction")
    public String listeAction(@RequestParam("id") Integer id, Entiteaction entiteaction, Model model) {
        long debut = System.currentTimeMillis();
        model.addAttribute("entitedesign", entitedesignService.get(id));
        logger.info(System.currentTimeMillis() - debut);
        return "listeaction";
    }


}
