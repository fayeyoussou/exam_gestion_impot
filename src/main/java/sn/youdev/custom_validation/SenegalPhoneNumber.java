package sn.youdev.custom_validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SenegalPhoneNumberValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface SenegalPhoneNumber {
    String message() default "Format numero de telephone invalide";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}