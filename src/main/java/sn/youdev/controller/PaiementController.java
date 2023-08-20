package sn.youdev.controller;


import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.youdev.controller.config.Constante;
import sn.youdev.dto.request.DeclarationRequest;
import sn.youdev.dto.request.PaiementRequest;
import sn.youdev.dto.response.DeclarationResponse;
import sn.youdev.dto.response.PaiementResponse;
import sn.youdev.service.PaiementService;

@Controller
@RequestMapping("/paiement")
@Slf4j
public class PaiementController {
    private final PaiementService service;

    public PaiementController(PaiementService service) {
        this.service = service;
    }
    @GetMapping
    public String liste(Model model){
        model.addAttribute("content","paiement_liste");
        model.addAttribute("paiements",service.liste());
        return Constante.LAYOUT;
    }
    @ModelAttribute(name = "paiementRequest")
    public PaiementRequest paiementRequest(){
        return new PaiementRequest();
    }
    @GetMapping(Constante.CREATE)
    public String paiementForme(Model model){
        model.addAttribute("content","create_paiement");
        model.addAttribute("declarations",service.listeDeclaration());
        return Constante.LAYOUT;
    }
//    @PostMapping(Constante.CREATE)
//    public String createPaiement(@Valid PaiementRequest request, Errors errors, Model model){
//        if(errors.hasErrors()){
//            return paiementForme(model);
//        }
//        PaiementResponse paiement =  service.save(request);
//        log.info("paiement_added",paiement);
//        return "redirect:/paiement";
//    }
}
