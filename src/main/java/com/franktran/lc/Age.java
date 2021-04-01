package com.franktran.lc;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

    int lower() default 18;

    int upper() default 60;

    String message() default "{Age.userRegistration.age}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
