package cesar.bruno.brazilianphonevalidators.annotations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

import cesar.bruno.brazilianphonevalidators.validators.BrazilianMobileOrLandLineValidator;

@Constraint(validatedBy = BrazilianMobileOrLandLineValidator.class)
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface BrazilianMobileOrLandLine {

	String message() default "invalid brazilian mobile/land line number";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
