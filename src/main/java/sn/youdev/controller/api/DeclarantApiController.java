package sn.youdev.controller.api;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.youdev.dto.request.DeclarantRequest;
import sn.youdev.model.Declarant;
import sn.youdev.service.DeclarantService;

import java.util.List;

@RestController
@RequestMapping("api/declarant")
public class DeclarantApiController {
    private final DeclarantService service;

    public DeclarantApiController(DeclarantService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Declarant>> liste(){
        return ResponseEntity.ok(service.listeDeclarant());
    }
    @PostMapping
    public ResponseEntity<Declarant> save (@RequestBody @Valid DeclarantRequest request){
        return ResponseEntity.ok(service.saveDeclarant(request));
    }
}
