package sn.youdev.dto.response;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.io.Serializable;
import java.util.Calendar;

/**
 * DTO for {@link sn.youdev.model.Declaration}
 */
public record DeclarationResponse(
        Long id,
        Calendar dateDeclaration,
        Double montantDeclaration,
        Long declarantId,
        String declarantRaisonSocial
) implements Serializable {

}