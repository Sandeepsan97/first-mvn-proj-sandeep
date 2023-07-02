package holidaywork;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLeapYear {
	@Test // Annotation is marker for JUNIT to run this method automatically
	public void testValidateyear() {
		int start=2000;
		int end=2022;
		int year=LeapYearValidator.countLeapYear(start, end);
		 Assertions.assertEquals(6, year);
	}
	

	
	
	@Test
	public void testInValidateyear() {
		int start=2022;
		int end=2000;
		try {
			LeapYearValidator.countLeapYear(start, end);
			Assertions.fail("Validateleap failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid range: startYear must be less than or equal to endYear.", ex.getMessage());
		}
	}
}
