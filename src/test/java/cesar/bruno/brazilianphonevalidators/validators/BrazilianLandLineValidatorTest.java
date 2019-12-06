package cesar.bruno.brazilianphonevalidators.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BrazilianLandLineValidatorTest {

	private BrazilianLandLineValidator validator = new BrazilianLandLineValidator();

	private String phoneNumber = "";

	private boolean result = false;

	@Test
	public void validNumberStartWithTwoShouldReturnTrue() {

		phoneNumber = "11 92112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "(11) 92112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "11921123334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "1192112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);
	}


	@Test
	public void invalidNumbersShouldReturnFalse() {

		phoneNumber = "12346123445";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "11111111111";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "22222222222";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "33333333333";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "44444444444";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "55555555555";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "66666666666";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "77777777777";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "88888888888";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "99999999999";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "11289585655";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

	}

}
