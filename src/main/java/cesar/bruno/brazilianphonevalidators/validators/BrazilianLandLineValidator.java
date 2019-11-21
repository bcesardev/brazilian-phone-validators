package cesar.bruno.brazilianphonevalidators.validators;

import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.LAND_LINE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FIVE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FOUR_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_THREE_REGEX;
import static cesar.bruno.brazilianphonevalidators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_TWO_REGEX;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cesar.bruno.brazilianphonevalidators.annotations.BrazilianMobileOrLandLine;
import cesar.bruno.brazilianphonevalidators.utils.StringUtils;

public class BrazilianLandLineValidator implements ConstraintValidator<BrazilianMobileOrLandLine, String> {

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

		if (valueCleaned.matches(LAND_LINE_REGEX) && valueCleaned.matches(NEGATE_SEQUENCE_OF_TWO_REGEX)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_THREE_REGEX)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_FOUR_REGEX)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_FIVE_REGEX)) {
			return true;
		}

		return false;
	}

}
