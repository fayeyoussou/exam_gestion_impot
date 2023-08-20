package sn.youdev.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import sn.youdev.controller.config.Constante;
import sn.youdev.dto.PaiementInfo;
import sn.youdev.dto.request.DeclarantRequest;
import sn.youdev.dto.request.DeclarationRequest;
import sn.youdev.dto.request.PaiementRequest;
import sn.youdev.dto.response.DeclarationResponse;
import sn.youdev.model.Declarant;
import sn.youdev.service.DeclarationService;

@Controller
@RequestMapping("/declaration")
@Slf4j
public class DeclarationController {
    private final DeclarationService service;

    public DeclarationController(DeclarationService service) {
        this.service = service;
    }
    @GetMapping
    public String liste(Model model){
        model.addAttribute("content","declaration_liste");
        model.addAttribute("declarations",service.liste());
        return Constante.LAYOUT;
    }

    @ModelAttribute(name = "paiementRequest")
    public PaiementRequest paiementRequest(){
        return new PaiementRequest();
    }
    @ModelAttribute(name = "declarationRequest")
    public DeclarationRequest declarantRequest(){
        return new DeclarationRequest();
    }
    @GetMapping(Constante.CREATE)
    public String declarationForme(Model model){
        model.addAttribute("content","create_declaration");
        model.addAttribute("declarants",service.listeDeclarant());
        return Constante.LAYOUT;
    }
    @GetMapping("/declarant/{id}")
    public String getDeclarationByDeclarant (@PathVariable Long id,Model model){
        model.addAttribute("content","declaration_liste");
        model.addAttribute("declarations",service.listeByDeclarant(id));
        return Constante.LAYOUT;
    }
    @PostMapping(Constante.CREATE)
    public String createDeclaration(@Valid DeclarationRequest request, Errors errors, Model model){
        if(errors.hasErrors()){
            return declarationForme(model);
        }
        DeclarationResponse declarant =  service.save(request);
        log.info("declarant_added",declarant);
        return "redirect:/declaration";
    }
}
