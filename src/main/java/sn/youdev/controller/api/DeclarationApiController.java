package sn.youdev.controller.api;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.youdev.dto.request.DeclarationRequest;
import sn.youdev.dto.response.DeclarationResponse;
import sn.youdev.service.DeclarationService;

import java.util.List;

@RestController
@RequestMapping("/api/declaration")
public class DeclarationApiController {
    private final DeclarationService service;

    public DeclarationApiController(DeclarationService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<DeclarationResponse>> liste(){
        return ResponseEntity.ok(service.liste());
    }
    @PostMapping
    public ResponseEntity<DeclarationResponse> save(@RequestBody @Valid final DeclarationRequest request){
        return ResponseEntity.ok(service.save(request));
    }
}
