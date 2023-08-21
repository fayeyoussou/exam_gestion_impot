package sn.youdev.service;

import org.springframework.stereotype.Service;
import sn.youdev.dto.PaiementInfo;
import sn.youdev.dto.converter.PaiementConverter;
import sn.youdev.dto.request.PaiementRequest;
import sn.youdev.dto.response.DeclarationResponse;
import sn.youdev.dto.response.PaiementResponse;
import sn.youdev.model.Paiement;
import sn.youdev.repository.PaiementRepository;

import java.util.List;

@Service
public class PaiementServiceImpl implements PaiementService {
    private final PaiementRepository repo;
    private final PaiementConverter converter;
    private final DeclarationService service;

    public PaiementServiceImpl(PaiementRepository repo, PaiementConverter converter, DeclarationService service) {
        this.repo = repo;
        this.converter = converter;
        this.service = service;
    }

    @Override
    public Paiement find(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public PaiementResponse findById(Long id) {
        return find(id).toResponse();
    }

    @Override
    public Paiement save(PaiementRequest request) {
        Paiement paiement = converter.convert(request);
        assert paiement != null;
        return repo.save(paiement);
    }

    @Override
    public List<PaiementResponse> liste() {
        return repo.findAll().stream().map(Paiement::toResponse).toList();
    }

    @Override
    public List<PaiementResponse> listePaiementDeclaration(Long id) {
        return repo.findPaiementsByDeclaration_Id(id).stream().map(Paiement::toResponse).toList();

    }

    @Override
    public List<DeclarationResponse> listeDeclaration() {
        return service.liste();
    }

    @Override
    public PaiementInfo getPaiementInfo(Long id) {
        return service.getPaiementInfo(id);
    }
}
