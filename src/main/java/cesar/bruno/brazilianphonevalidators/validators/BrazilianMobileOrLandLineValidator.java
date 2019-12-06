package cesar.bruno.brazilianphonevalidators.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cesar.bruno.brazilianphonevalidators.annotations.BrazilianMobileOrLandLine;
import cesar.bruno.brazilianphonevalidators.utils.StringUtils;

public class BrazilianMobileOrLandLineValidator implements ConstraintValidator<BrazilianMobileOrLandLine, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		// Validation is only applied if there is a value entered. Otherwise it is not
		// validated. Use @NotBlank to validate these condition.
		if (value == null || value.trim().equals("")) {
			return true;
		}

		final String valueCleaned = StringUtils.replaceAllNonNumbers(value);
		return isValidLandLine(valueCleaned, context) || isValidMobile(valueCleaned, context);
	}

	private boolean isValidMobile(String valueCleaned, ConstraintValidatorContext context) {
		return new BrazilianMobileValidator().isValid(valueCleaned, context);
	}

	private boolean isValidLandLine(String valueCleaned, ConstraintValidatorContext context) {
		return new BrazilianLandLineValidator().isValid(valueCleaned, context);
	}

}
