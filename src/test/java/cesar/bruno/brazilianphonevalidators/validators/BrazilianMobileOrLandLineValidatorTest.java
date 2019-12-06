package cesar.bruno.brazilianphonevalidators.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BrazilianMobileOrLandLineValidatorTest {

	private BrazilianMobileOrLandLineValidator validator = new BrazilianMobileOrLandLineValidator();

	private String mobileOrLandLineNumber = "";

	private boolean result = false;

	@Test
	public void invalidMobileShouldReturnFalse() {

		mobileOrLandLineNumber = "(11) 65442-2222";

		result = validator.isValid(mobileOrLandLineNumber, null);

		assertFalse(result);
	}

	@Test
	public void invalidLandLineShouldReturnFalse() {

		mobileOrLandLineNumber = "(12) 9009-0000";

		result = validator.isValid(mobileOrLandLineNumber, null);

		assertFalse(result);
	}

	@Test
	public void validMobileShouldReturnTrue() {

		mobileOrLandLineNumber = "(11) 95544-2552";

		result = validator.isValid(mobileOrLandLineNumber, null);

		assertTrue(result);

	}

	@Test
	public void validLandLineShouldReturnTrue() {

		mobileOrLandLineNumber = "(11) 4544-2552";

		result = validator.isValid(mobileOrLandLineNumber, null);

		assertTrue(result);

	}
}
