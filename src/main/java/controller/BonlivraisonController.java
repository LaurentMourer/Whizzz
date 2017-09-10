package controller;

import model.Bonlivraison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.BonlivraisonService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BonlivraisonController {
    @Autowired
    private BonlivraisonService bonlivraisonService;

   /* @RequestMapping(value = "/bonlivraison**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security + Hibernate Example");
        model.addObject("message", "This page is for ROLE_ADMIN only!");
        model.addObject("Bonlivraison", bonlivraisonService.getAll());
        model.setViewName("bonlivraison");

        return model;

    }

    public BonlivraisonService getBonlivraisonService() {
        return bonlivraisonService;
    }

    public void setBonlivraisonService(BonlivraisonService bonlivraisonService) {
        this.bonlivraisonService = bonlivraisonService;
    }
    */



   @ModelAttribute("allBonLivraison")
   public List<Bonlivraison> populateTypes() {
       return bonlivraisonService.getAll();
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

    @PostMapping("/creerBonLivraison")
    public String checkBonLivraisonInfo(@Valid Bonlivraison bonlivraison, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "creerBonLivraison";
        }
        return "redirect:/creerBonLivraison";

    }


   /* @RequestMapping(value="/seedstartermng", params={"save"})
    public String saveSeedstarter(
            final SeedStarter seedStarter, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "seedstartermng";
        }
        this.seedStarterService.add(seedStarter);
        model.clear();
        return "redirect:/seedstartermng";
    }*/
}
