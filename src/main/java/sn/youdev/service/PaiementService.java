package sn.youdev.service;

import sn.youdev.dto.request.PaiementRequest;
import sn.youdev.dto.response.DeclarationResponse;
import sn.youdev.dto.response.PaiementResponse;
import sn.youdev.model.Paiement;

import java.util.List;

public interface PaiementService {
    Paiement find(Long id);
    PaiementResponse findById(Long id);
    PaiementResponse save(PaiementRequest request);
    List<PaiementResponse> liste();

    List<DeclarationResponse> listeDeclaration();
}
