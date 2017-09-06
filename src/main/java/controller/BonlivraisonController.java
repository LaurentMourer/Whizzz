package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.BonlivraisonService;

@Controller
public class BonlivraisonController {
    @Autowired
    private BonlivraisonService bonlivraisonService;

    @RequestMapping(value = "/bonlivraison**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security + Hibernate Example");
        model.addObject("message", "This page is for ROLE_ADMIN only!");
        model.addObject("Bonlivraison", bonlivraisonService.getAll());
        model.setViewName("admin");

        return model;

    }

    public BonlivraisonService getBonlivraisonService() {
        return bonlivraisonService;
    }

    public void setBonlivraisonService(BonlivraisonService bonlivraisonService) {
        this.bonlivraisonService = bonlivraisonService;
    }
}
