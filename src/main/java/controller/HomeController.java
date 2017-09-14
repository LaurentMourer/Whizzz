package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @PostMapping({"/", "/home"})
    public String postHome() {
        return "home";
    }

    @GetMapping({"/", "/home"})
    public String getHome() {
        return "home";
    }

}
