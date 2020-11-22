package com.example.springcustomvalidator.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IdentityFormatValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IdentityFormatConstraint {

    String message() default "Invalid identity format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
