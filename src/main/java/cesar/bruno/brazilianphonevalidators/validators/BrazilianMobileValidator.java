package cesar.bruno.brazilianphonevalidators.validators;

import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.MOBILE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.NEGATE_NINE_SEQUENCE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.NEGATE_SEVEN_SEQUENCE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.NEXTEL_REGEX;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cesar.bruno.brazilianphonevalidators.annotations.BrazilianMobileOrLandLine;
import cesar.bruno.brazilianphonevalidators.utils.StringUtils;

public class BrazilianMobileValidator implements ConstraintValidator<BrazilianMobileOrLandLine, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		// Validation is only applied if there is a value entered. Otherwise it is not
		// validated. Use @NotBlank to validate these condition.
		if (value == null || value.equals("")) {
			return true;
		}

		final String valueCleaned = StringUtils.replaceAllNonNumbers(value);

		return validate(valueCleaned, context);

	}

	private Boolean validate(String valueCleaned, ConstraintValidatorContext context) {

		if (valueCleaned.matches(MOBILE_REGEX) && valueCleaned.matches(NEGATE_NINE_SEQUENCE_REGEX)) {
			return true;
		}

		if (valueCleaned.matches(NEXTEL_REGEX) && valueCleaned.matches(NEGATE_SEVEN_SEQUENCE_REGEX)) {
			return true;
		}

		return false;
	}

}