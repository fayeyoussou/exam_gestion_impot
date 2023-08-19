package sn.youdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sn.youdev.controller.config.Constante;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return Constante.LAYOUT;
    }
}
