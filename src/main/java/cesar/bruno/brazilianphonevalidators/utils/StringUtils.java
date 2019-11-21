package cesar.bruno.brazilianphonevalidators.utils;

public final class StringUtils {

	private StringUtils() {
	}

	public static String replaceAllNonNumbers(String value) {
		return value != null ? value.replaceAll("[^0-9]", "") : "";
	}

}
