package sn.youdev.dto.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sn.youdev.dto.request.DeclarantRequest;
import sn.youdev.model.Declarant;
@Component
public class DeclarantConverter  implements Converter<DeclarantRequest, Declarant> {
    @Override
    public Declarant convert(DeclarantRequest req) {
        Declarant declarant = new Declarant();
        declarant.setAdresse(req.getAdresse());
        declarant.setEmail(req.getEmail());
        declarant.setRaisonSocial(req.getRaisonSocial());
        declarant.setTelephone(req.getTelephone());
        return declarant;
    }

}
