package com.thnp.store.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = { DayOfBirthValidator.class })
public @interface DayOfBirthConstraint {
    String message() default "Invalid day of birth";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    int min();
}
