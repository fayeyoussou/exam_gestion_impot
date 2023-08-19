package sn.youdev.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sn.youdev.dto.response.DeclarationResponse;

import java.util.Calendar;
import java.util.Objects;

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
    //Declaration(id long, dateDeclaration date, montantDeclaration  double, idDeclarant long)
    public DeclarationResponse toResponse(){
        return new DeclarationResponse(
                id,
                dateDeclaration,
                montantDeclaration,
                declarant.getId(),
                declarant.getRaisonSocial()
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