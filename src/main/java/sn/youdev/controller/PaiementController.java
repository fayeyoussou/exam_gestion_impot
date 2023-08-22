package sn.youdev.controller;


import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import sn.youdev.controller.config.Constante;
import sn.youdev.dto.PaiementInfo;
import sn.youdev.dto.request.PaiementRequest;
import sn.youdev.model.Paiement;
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
    @GetMapping("/declaration/{id}")
    public String listerPaiement(Model model,@PathVariable("id") final Long id){
        model.addAttribute("content","paiement_liste");
        model.addAttribute("infoPaiement",service.getPaiementInfo(id));
        model.addAttribute("paiements",service.listePaiementDeclaration(id));
        return Constante.LAYOUT;
    }
    @ModelAttribute(name = "paiementRequest")
    public PaiementRequest paiementRequest(){
        return new PaiementRequest();
    }
    @GetMapping("/declaration/paier/{id}")
    public String paiementForme(@PathVariable("id") final Long id, Model model){

        model.addAttribute("content","create_paiement");
        PaiementInfo paiementInfo = service.getPaiementInfo(id);

        model.addAttribute("infoPaiement",paiementInfo);
        model.addAttribute("idDeclaration",id);

//        model.addAttribute("declarations",service.listeDeclaration());
        return Constante.LAYOUT;
    }
    @PostMapping("/declaration/paier/{id}")
    public String addPaiement(@PathVariable Long id, @Valid PaiementRequest paiementRequest,Errors errors,Model model){
        if(errors.hasErrors()){
            return paiementForme(id,model);
        }
        Paiement paiement = service.save(paiementRequest);
        return "redirect:/declaration/declarant/"+paiement.getDeclaration().getDeclarant().getId();
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
