package cesar.bruno.brazilianphonevalidators.utils;

public class BrazilianLandLineValidatorUtils {

	public static final String LAND_LINE_REGEX = "\\(?[1-9][0-9]\\)?\\s?[2-5]\\s?-?\\s?[0-9]{7}";

	public static final String NEGATE_SEQUENCE_OF_TWO_REGEX = "^(?:(?!\\(?22\\)?\\s?2222\\s?-?\\s?2222).)*$";

	public static final String NEGATE_SEQUENCE_OF_THREE_REGEX = "^(?:(?!\\(?33\\)?\\s?3333\\s?-?\\s?3333).)*$";

	public static final String NEGATE_SEQUENCE_OF_FOUR_REGEX = "^(?:(?!\\(?44\\)?\\s?4444\\s?-?\\s?4444).)*$";

	public static final String NEGATE_SEQUENCE_OF_FIVE_REGEX = "^(?:(?!\\(?55\\)?\\s?5555\\s?-?\\s?5555).)*$";

	private BrazilianLandLineValidatorUtils() {
	}
}
