package cesar.bruno.brazilian_phone_validators.validators;

import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.LAND_LINE_REGEX;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FIVE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FOUR;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_THREE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_TWO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cesar.bruno.brazilian_phone_validators.annotations.BrazilianMobileOrLandLine;
import cesar.bruno.brazilian_phone_validators.utils.StringUtils;

public class BrazilianLandLineValidator implements ConstraintValidator<BrazilianMobileOrLandLine, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || value.equals("")) {
			return true;
		}

		final String valueCleaned = StringUtils.replaceAllNonNumbers(value);

		return validate(valueCleaned, context);

	}

	private Boolean validate(String valueCleaned, ConstraintValidatorContext context) {

		if (valueCleaned.matches(LAND_LINE_REGEX) && valueCleaned.matches(NEGATE_SEQUENCE_OF_TWO)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_THREE) && valueCleaned.matches(NEGATE_SEQUENCE_OF_FOUR)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_FIVE)) {
			return true;
		}

		return false;
	}

}
