package com.example.springcustomvalidator.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateFormatValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateFormatConstraint {
    String message() default "Invalid date time format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
