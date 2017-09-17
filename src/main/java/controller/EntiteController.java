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
import service.EntiteFichierService;
import service.EntiteSqlService;
import service.EntitedesignService;

import javax.validation.Valid;

@Controller
public class EntiteController {

    @Autowired
    private EntitedesignService entitedesignService;
    @Autowired
    private EntiteFichierService entiteFichierService;
    @Autowired
    private EntiteSqlService entiteSqlService;

    private static final Logger logger = Logger.getLogger(EntiteController.class);

    public EntiteController() {
        super();
    }

  /*  @GetMapping("/listeEntite")
    public String listeEntite( @RequestParam("id") String id, Entitedesign entitedesign, Entitefichier entitefichier, Entitesql entitesql, Model model) {
        model.addAttribute("bonLivraison", entitedesignService.getAll());
        return "listeEntite";
    }*/

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
    public String checkEntiteFichier(@Valid final Entitefichier entiteFichier, final BindingResult bindingResult, final ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "listeEntite";
        }
        logger.info(entiteFichier.toString());
        entiteFichierService.create(entiteFichier);
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


}
