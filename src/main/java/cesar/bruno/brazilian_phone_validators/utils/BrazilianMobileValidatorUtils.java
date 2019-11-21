package cesar.bruno.brazilian_phone_validators.utils;

public class BrazilianMobileValidatorUtils {

	public static final String MOBILE_REGEX = "\\(?[1-9][0-9]\\)?\\s?[9]\\s?[0-9]{4}\\s?-?\\s?[0-9]{4}";

	public static final String NEXTEL_REGEX = "\\(?[1-9][0-9]\\)?\\s?[7][0-9]{3}\\s?-?\\s?[0-9]{4}";

	public static final String NEGATE_NINE_SEQUENCE = "^(?:(?!\\(?99\\)?\\s?9\\s?9999\\s?-?\\s?9999).)*$";

	public static final String NEGATE_SEVEN_SEQUENCE = "^(?:(?!\\(?77\\)?\\s?7777\\s?-?\\s?7777).)*$";

	public static final Integer MOBILE_CLEANED_DIGITS = 11;

	private BrazilianMobileValidatorUtils() {
	}

}
