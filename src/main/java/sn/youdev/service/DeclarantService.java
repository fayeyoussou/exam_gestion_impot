package sn.youdev.service;

import org.springframework.stereotype.Service;
import sn.youdev.dto.request.DeclarantRequest;
import sn.youdev.model.Declarant;

import java.util.List;

public interface DeclarantService {
    Declarant getDeclarant(Long id);
    List<Declarant> listeDeclarant();
    Declarant saveDeclarant(DeclarantRequest request);
}
