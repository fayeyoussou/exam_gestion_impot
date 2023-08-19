package sn.youdev.dto.response;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Calendar;

/**
 * DTO for {@link sn.youdev.model.Paiement}
 */
public record PaiementResponse(Long id, Calendar datePaiement, double montantPaiement,
                               Long declarationId) implements Serializable {
}