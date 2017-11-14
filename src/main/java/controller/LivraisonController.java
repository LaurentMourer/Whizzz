package controller;

import model.Livraison;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.LivraisonService;

@Controller
public class LivraisonController {

    private final LivraisonService livraisonService;

    private static final Logger logger = Logger.getLogger(BonlivraisonController.class);

    @Autowired
    public LivraisonController(LivraisonService livraisonService) {
        super();
        this.livraisonService = livraisonService;
    }

    @GetMapping("/listeLivraison")
    public String listeLivraison(Livraison livraison, Model model) {
        long debut = System.currentTimeMillis();
        model.addAttribute("livraison", livraisonService.getAll());
        logger.info(System.currentTimeMillis() - debut);
        return "listeLivraison";
    }

}


