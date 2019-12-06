package cesar.bruno.brazilianphonevalidators.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BrazilianMobileValidatorTest {

	private BrazilianMobileValidator validator = new BrazilianMobileValidator();

	private String mobileNumber = "";

	private boolean result = false;

	@Test
	public void validNumberStartWithTwoShouldReturnTrue() {

		mobileNumber = "11 2112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "(11) 2112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "1121123334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "112112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);
	}

	@Test
	public void validNumberStartWithThreeShouldReturnTrue() {

		mobileNumber = "11 3112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "(11) 3112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "1131123334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "113112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);
	}

	@Test
	public void validNumberStartWithFourShouldReturnTrue() {

		mobileNumber = "11 4112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "(11) 4112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "1141123334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "114112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);
	}

	@Test
	public void validNumberStartWithFiveShouldReturnTrue() {

		mobileNumber = "11 5112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "(11) 5112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "1151123334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "115112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);
	}

	@Test
	public void invalidNumbersShouldReturnFalse() {

		mobileNumber = "123465";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "1111111111";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "2222222222";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "3333333333";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "4444444444";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "5555555555";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "6666666666";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "7777777777";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "8888888888";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "9999999999";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "1189585655";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

	}
}
