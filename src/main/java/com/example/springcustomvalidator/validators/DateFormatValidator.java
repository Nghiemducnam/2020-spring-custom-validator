package com.example.springcustomvalidator.validators;

import com.example.springcustomvalidator.utils.Utils;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateFormatValidator implements ConstraintValidator<DateFormatConstraint, String> {
    @Override
    public void initialize(DateFormatConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(s)) {
            return true;
        }
        return Utils.validateDateFormat(s);
    }
}
