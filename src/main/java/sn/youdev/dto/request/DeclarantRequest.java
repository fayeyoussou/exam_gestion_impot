package sn.youdev.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import sn.youdev.custom_validation.SenegalPhoneNumber;

import java.io.Serializable;
/**
 * DTORequest for {@link sn.youdev.model.Declarant}
 */@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeclarantRequest {

    @NotNull
    @NotBlank
    @Length(min = 3)
    private String raisonSocial;

    @NotNull
    @NotBlank
    @Length(min = 3)
    private String adresse;

    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotNull
    @NotBlank
    @SenegalPhoneNumber
    private String telephone;
}
