package sn.youdev.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sn.youdev.dto.response.DeclarationResponse;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@Getter
@Setter
@Entity
@Table(name = "declarations")
public class Declaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Calendar dateDeclaration;
    private Double montantDeclaration;
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Declarant declarant;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "declaration")
    private List<Paiement> paiements = new ArrayList<>();
    //Declaration(id long, dateDeclaration date, montantDeclaration  double, idDeclarant long)
    public DeclarationResponse toResponse(){
        AtomicReference<Double> paiementRes = new AtomicReference<>(montantDeclaration);
        paiements.forEach(x->{
            paiementRes.updateAndGet(v -> v - x.getMontantPaiement());
        });
        return new DeclarationResponse(
                id,
                dateDeclaration,
                montantDeclaration,
                declarant.getId(),
                declarant.getRaisonSocial(),
                paiementRes.get()
        );
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Declaration declaration = (Declaration) o;
        return Objects.equals(id, declaration.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}