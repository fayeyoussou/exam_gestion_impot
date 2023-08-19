package sn.youdev.service;

import org.springframework.stereotype.Service;
import sn.youdev.dto.converter.DeclarationConverter;
import sn.youdev.dto.request.DeclarationRequest;
import sn.youdev.dto.response.DeclarationResponse;
import sn.youdev.model.Declarant;
import sn.youdev.model.Declaration;
import sn.youdev.repository.DeclarationRepository;

import java.util.List;

@Service
public class DeclarationServiceImpl implements DeclarationService {
    private final DeclarationRepository repo;
    private final DeclarationConverter converter;
    private final DeclarantService declarantService;

    public DeclarationServiceImpl(DeclarationRepository repo, DeclarationConverter converter, DeclarantService declarantService) {
        this.repo = repo;
        this.converter = converter;
        this.declarantService = declarantService;
    }

    @Override
    public List<Declarant> listeDeclarant() {
        return declarantService.listeDeclarant();
    }

    @Override
    public Declaration find(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public DeclarationResponse findById(Long id) {
        return find(id).toResponse();
    }

    @Override
    public List<DeclarationResponse> liste() {
        return repo.findAll().stream().map(Declaration::toResponse).toList() ;
    }

    @Override
    public DeclarationResponse save(DeclarationRequest request) {
        Declaration declaration = converter.convert(request);
        return  repo.save(declaration).toResponse();

    }

    @Override
    public List<DeclarationResponse> listeByDeclarant(Long id) {
        return repo.findAllByDeclarant_Id(id).stream().map(Declaration::toResponse).toList() ;
    }
}
