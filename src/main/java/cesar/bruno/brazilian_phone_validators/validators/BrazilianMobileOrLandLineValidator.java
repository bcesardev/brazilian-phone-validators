package cesar.bruno.brazilian_phone_validators.validators;

import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.LAND_LINE_REGEX;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FIVE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_FOUR;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_THREE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianLandLineValidatorUtils.NEGATE_SEQUENCE_OF_TWO;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.MOBILE_CLEANED_DIGITS;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.MOBILE_REGEX;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.NEGATE_NINE_SEQUENCE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.NEGATE_SEVEN_SEQUENCE;
import static cesar.bruno.brazilian_phone_validators.utils.BrazilianMobileValidatorUtils.NEXTEL_REGEX;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cesar.bruno.brazilian_phone_validators.annotations.BrazilianMobileOrLandLine;
import cesar.bruno.brazilian_phone_validators.utils.StringUtils;

public class BrazilianMobileOrLandLineValidator implements ConstraintValidator<BrazilianMobileOrLandLine, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || value.equals("")) {
			return true;
		}

		final String valueCleaned = StringUtils.replaceAllNonNumbers(value);

		Boolean result = valueCleaned.length() < MOBILE_CLEANED_DIGITS ? validateLandLine(valueCleaned, context)
				: validateMobile(valueCleaned, context);

		return result;
	}

	private Boolean validateMobile(String valueCleaned, ConstraintValidatorContext context) {

		if (valueCleaned.matches(MOBILE_REGEX) && valueCleaned.matches(NEGATE_NINE_SEQUENCE)) {
			return true;
		}

		if (valueCleaned.matches(NEXTEL_REGEX) && valueCleaned.matches(NEGATE_SEVEN_SEQUENCE)) {
			return true;
		}

		return false;
	}

	private Boolean validateLandLine(String valueCleaned, ConstraintValidatorContext context) {

		if (valueCleaned.matches(LAND_LINE_REGEX) && valueCleaned.matches(NEGATE_SEQUENCE_OF_TWO)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_THREE) && valueCleaned.matches(NEGATE_SEQUENCE_OF_FOUR)
				&& valueCleaned.matches(NEGATE_SEQUENCE_OF_FIVE)) {
			return true;
		}

		return false;
	}

}
