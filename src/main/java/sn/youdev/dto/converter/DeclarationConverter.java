package sn.youdev.dto.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sn.youdev.dto.request.DeclarationRequest;
import sn.youdev.model.Declaration;
import sn.youdev.repository.DeclarantRepository;

@Component
public class DeclarationConverter implements Converter<DeclarationRequest, Declaration> {
    private final DeclarantRepository repo;
    private final CalendarConverter converter;

    @Autowired
    public DeclarationConverter(DeclarantRepository declarantRepository, CalendarConverter converter) {
        this.repo = declarantRepository;
        this.converter = converter;
    }

    @Override
    public Declaration convert(DeclarationRequest source) {
        Declaration declaration = new Declaration();

        declaration.setDateDeclaration(converter.convert(source.getDateDeclaration()));
        declaration.setMontantDeclaration(source.getMontantDeclaration());
        declaration.setDeclarant(repo.findById(source.getIdDeclarant()).orElse(null));
        return declaration;
    }
}
