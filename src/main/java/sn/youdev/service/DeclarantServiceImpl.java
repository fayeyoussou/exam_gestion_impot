package sn.youdev.service;

import org.springframework.stereotype.Service;
import sn.youdev.dto.converter.DeclarantConverter;
import sn.youdev.dto.request.DeclarantRequest;
import sn.youdev.model.Declarant;
import sn.youdev.repository.DeclarantRepository;

import java.util.List;

@Service
public class DeclarantServiceImpl implements DeclarantService {
    private final DeclarantRepository repo;
    private final DeclarantConverter converter;
    public DeclarantServiceImpl(DeclarantRepository repo, DeclarantConverter converter) {
        this.repo = repo;
        this.converter = converter;
    }

    @Override
    public Declarant getDeclarant(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Declarant> listeDeclarant() {
        return repo.findAll();
    }

    @Override
    public Declarant saveDeclarant(DeclarantRequest request) {
        Declarant declarant = converter.convert(request);
        if(declarant !=null )return repo.save(declarant);
        else return null;
    }
}
