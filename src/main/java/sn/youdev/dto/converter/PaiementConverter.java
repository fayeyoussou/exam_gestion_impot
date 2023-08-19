package sn.youdev.dto.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sn.youdev.dto.request.PaiementRequest;
import sn.youdev.model.Paiement;
import sn.youdev.repository.DeclarationRepository;

@Component
public class PaiementConverter implements Converter<PaiementRequest,Paiement > {
    private final DeclarationRepository repo;
    private final CalendarConverter converter;
    @Autowired
    public PaiementConverter(DeclarationRepository repo, CalendarConverter converter) {
        this.repo = repo;
        this.converter = converter;
    }

    @Override
    public Paiement convert(PaiementRequest source) {
        Paiement paiement = new Paiement();
        paiement.setDatePaiement(converter.convert(source.getDatePaiement()));
        paiement.setMontantPaiement(source.getMontantPaiement());
        paiement.setDeclaration(repo.findById(source.getDeclarationId()).orElseThrow());
        return paiement;
    }
}
