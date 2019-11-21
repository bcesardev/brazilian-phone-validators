package cesar.bruno.brazilianphonevalidators.validators;

import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.LAND_LINE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FIVE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FOUR_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_THREE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_TWO_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.MOBILE_CLEANED_DIGITS_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.MOBILE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.NEGATE_NINE_SEQUENCE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.NEGATE_SEVEN_SEQUENCE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianMobileValidatorUtils.NEXTEL_REGEX;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cesar.bruno.brazilianphonevalidators.annotations.BrazilianMobileOrLandLine;
import cesar.bruno.brazilianphonevalidators.utils.StringUtils;

public class BrazilianMobileOrLandLineValidator implements ConstraintValidator<BrazilianMobileOrLandLine, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		// Validation is only applied if there is a value entered. Otherwise it is not
		// validated. Use @NotBlank to validate these condition.
		if (value == null || value.equals("")) {
			return true;
		}

		final String valueCleaned = StringUtils.replaceAllNonNumbers(value);

		Boolean result = valueCleaned.length() < MOBILE_CLEANED_DIGITS_REGEX ? validateLandLine(valueCleaned, context)
				: validateMobile(valueCleaned, context);

		return result;
	}

	private Boolean validateMobile(String valueCleaned, ConstraintValidatorContext context) {

		if (valueCleaned.matches(MOBILE_REGEX) && valueCleaned.matches(NEGATE_NINE_SEQUENCE_REGEX)) {
			return true;
		}

		if (valueCleaned.matches(NEXTEL_REGEX) && valueCleaned.matches(NEGATE_SEVEN_SEQUENCE_REGEX)) {
			return true;
		}

		return false;
	}

	private Boolean validateLandLine(String valueCleaned, ConstraintValidatorContext context) {

		if (valueCleaned.matches(LAND_LINE_REGEX) && valueCleaned.matches(NEGATE_SEQUENCE_OF_TWO_REGEX)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_THREE_REGEX)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_FOUR_REGEX)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_FIVE_REGEX)) {
			return true;
		}

		return false;
	}

}
