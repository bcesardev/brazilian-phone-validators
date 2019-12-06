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

		phoneNumber = "11 2112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "(11) 2112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "1121123334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "112112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);
	}

	@Test
	public void validNumberStartWithThreeShouldReturnTrue() {

		phoneNumber = "11 3112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "(11) 3112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "1131123334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "113112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);
	}

	@Test
	public void validNumberStartWithFourShouldReturnTrue() {

		phoneNumber = "11 4112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "(11) 4112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "1141123334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "114112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);
	}

	@Test
	public void validNumberStartWithFiveShouldReturnTrue() {

		phoneNumber = "11 5112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "(11) 5112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "1151123334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);

		phoneNumber = "115112-3334";
		result = validator.isValid(phoneNumber, null);
		assertTrue(result);
	}

	@Test
	public void invalidNumbersShouldReturnFalse() {

		phoneNumber = "123465";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "1111111111";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "2222222222";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "3333333333";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "4444444444";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "5555555555";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "6666666666";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "7777777777";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "8888888888";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "9999999999";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);

		phoneNumber = "1189585655";
		result = validator.isValid(phoneNumber, null);
		assertFalse(result);
	}

}
