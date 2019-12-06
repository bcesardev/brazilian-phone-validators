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
		if (value == null || value.trim().equals("")) {
			return true;
		}

		final String valueCleaned = StringUtils.replaceAllNonNumbers(value);

		return validate(valueCleaned);
	}

	private Boolean validate(String value) {
		return isValidMobile(value) || isValidNextel(value);
	}

	private boolean isValidMobile(String value) {
		return value.matches(MOBILE_REGEX) && value.matches(NEGATE_NINE_SEQUENCE_REGEX);
	}

	private boolean isValidNextel(String value) {
		return value.matches(NEXTEL_REGEX) && value.matches(NEGATE_SEVEN_SEQUENCE_REGEX);
	}

}
