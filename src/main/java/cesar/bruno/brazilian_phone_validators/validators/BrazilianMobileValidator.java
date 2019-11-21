package cesar.bruno.brazilian_phone_validators.validators;

import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.MOBILE_REGEX;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.NEGATE_NINE_SEQUENCE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.NEGATE_SEVEN_SEQUENCE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.NEXTEL_REGEX;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cesar.bruno.brazilian_phone_validators.annotations.BrazilianMobileOrLandLine;
import cesar.bruno.brazilian_phone_validators.utils.StringUtils;

public class BrazilianMobileValidator implements ConstraintValidator<BrazilianMobileOrLandLine, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || value.equals("")) {
			return true;
		}

		final String valueCleaned = StringUtils.replaceAllNonNumbers(value);

		return validate(valueCleaned, context);

	}

	private Boolean validate(String valueCleaned, ConstraintValidatorContext context) {

		if (valueCleaned.matches(MOBILE_REGEX) && valueCleaned.matches(NEGATE_NINE_SEQUENCE)) {
			return true;
		}

		if (valueCleaned.matches(NEXTEL_REGEX) && valueCleaned.matches(NEGATE_SEVEN_SEQUENCE)) {
			return true;
		}

		return false;
	}

}
