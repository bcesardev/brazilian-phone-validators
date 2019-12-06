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

		mobileNumber = "11 92112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "(11) 92112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "11921123334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);

		mobileNumber = "1192112-3334";
		result = validator.isValid(mobileNumber, null);
		assertTrue(result);
	}


	@Test
	public void invalidNumbersShouldReturnFalse() {

		mobileNumber = "12346123445";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "11111111111";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "22222222222";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "33333333333";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "44444444444";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "55555555555";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "66666666666";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "77777777777";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "88888888888";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "99999999999";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

		mobileNumber = "11289585655";
		result = validator.isValid(mobileNumber, null);
		assertFalse(result);

	}
	
	
}
