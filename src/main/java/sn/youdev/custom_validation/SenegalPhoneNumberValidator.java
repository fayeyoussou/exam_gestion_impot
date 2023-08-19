package sn.youdev.custom_validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class SenegalPhoneNumberValidator implements ConstraintValidator<SenegalPhoneNumber, String> {
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^(\\+221|00221|0)[1-9][0-9]{8}$");

    @Override
    public void initialize(SenegalPhoneNumber constraintAnnotation) {
        // No initialization needed
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if (phoneNumber == null) {
            return false;
        }
        return PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches();
    }


}