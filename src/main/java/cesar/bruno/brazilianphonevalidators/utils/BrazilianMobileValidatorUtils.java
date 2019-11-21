package cesar.bruno.brazilianphonevalidators.utils;

public class BrazilianMobileValidatorUtils {

	public static final String MOBILE_REGEX = "\\(?[1-9][0-9]\\)?\\s?[9]\\s?[0-9]{4}\\s?-?\\s?[0-9]{4}";

	public static final String NEXTEL_REGEX = "\\(?[1-9][0-9]\\)?\\s?[7][0-9]{3}\\s?-?\\s?[0-9]{4}";

	public static final String NEGATE_NINE_SEQUENCE_REGEX = "^(?:(?!\\(?99\\)?\\s?9\\s?9999\\s?-?\\s?9999).)*$";

	public static final String NEGATE_SEVEN_SEQUENCE_REGEX = "^(?:(?!\\(?77\\)?\\s?7777\\s?-?\\s?7777).)*$";

	public static final Integer MOBILE_CLEANED_DIGITS_REGEX = 11;

	private BrazilianMobileValidatorUtils() {
	}

}
