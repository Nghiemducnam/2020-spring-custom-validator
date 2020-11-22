package com.example.springcustomvalidator.validators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdentityFormatValidator implements ConstraintValidator<IdentityFormatConstraint, String> {
    private final Logger log = LoggerFactory.getLogger(IdentityFormatValidator.class);
    @Value("${api.identity}")
    private String identityCode;

    @Override
    public void initialize(IdentityFormatConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        log.info("---IDENTITY CODE IS :{}---", this.identityCode);
        log.info("---IDENTITY VALUE IS :{}---", s);
        if(this.identityCode.equals(s)){
            return true;
        }else {
            return false;
        }

    }
}
