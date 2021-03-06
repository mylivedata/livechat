package org.mylivedata.app.dashboard.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created by lubo08 on 13.4.2014.
 */
@Documented
@Constraint(validatedBy = UserAgreementAcceptedValidator.class)
@Target( { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAgreementAccepted {

    String message() default "{UserAgreementAccepted.registrationFormDataView.agreement}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
