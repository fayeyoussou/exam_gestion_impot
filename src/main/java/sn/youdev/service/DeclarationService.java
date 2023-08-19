package sn.youdev.service;

import org.springframework.stereotype.Service;
import sn.youdev.dto.request.DeclarationRequest;
import sn.youdev.dto.response.DeclarationResponse;
import sn.youdev.model.Declarant;
import sn.youdev.model.Declaration;

import java.util.List;


public interface DeclarationService {
    List<Declarant> listeDeclarant();
    Declaration find(Long id);
    DeclarationResponse findById(Long id);
    List<DeclarationResponse> liste();
    DeclarationResponse save(DeclarationRequest request);

    List<DeclarationResponse> listeByDeclarant(Long id);
}
