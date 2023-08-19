package sn.youdev.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import sn.youdev.controller.config.Constante;
import sn.youdev.dto.request.DeclarantRequest;
import sn.youdev.model.Declarant;
import sn.youdev.service.DeclarantService;

@Controller
@RequestMapping("/declarant")
@Slf4j
public class DeclarantController {
    private final DeclarantService service;

    public DeclarantController(DeclarantService service) {
        this.service = service;
    }
    @GetMapping()
    public String listeDeclarants(Model model){
        model.addAttribute("declarants",service.listeDeclarant());
        model.addAttribute("content","liste_declarant");
        return Constante.LAYOUT;
    }
    @ModelAttribute(name = "declarantRequest")
    public DeclarantRequest declarantRequest(){
        return new DeclarantRequest();
    }
    @GetMapping(Constante.CREATE)
    public String declarantForme(Model model){
        model.addAttribute("content","create_declarant");
        return Constante.LAYOUT;
    }
    @PostMapping(Constante.CREATE)
    public String createDeclarant(@Valid DeclarantRequest request, Errors errors,Model model){
        if(errors.hasErrors()){
            model.addAttribute("content","create_declarant");
            return Constante.LAYOUT;
        }
        Declarant declarant =  service.saveDeclarant(request);
        log.info("declarant_added",declarant);
        return "redirect:/declarant";
    }
}
