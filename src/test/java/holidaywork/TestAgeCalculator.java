package holidaywork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestAgeCalculator {
	@Test //
	public void testValidAge() {
		  String validDateOfBirth = "1990-05-15";
		int validage =AgeValidator.calcualteAge(validDateOfBirth);
		Assertions.assertEquals(33, validage);
	}

	
	
	@Test //
	public void testInValidAge() {
		  String invalidDateOfBirth ="1990/05/15";;
	
		
		try {
			AgeValidator.calcualteAge(invalidDateOfBirth);
			Assertions.fail("ValidateAge failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid date format. Please enter the date in YYYY-MM-DD format.", ex.getMessage());
		}
	}
}
