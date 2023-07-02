package com.fssa.sp.holiday.project;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGroundDetails {
//  for valid ground  name
	@Test

	public void testValidName() {
		Assertions.assertTrue(GroundDetailsValidator.groundnameValidator("sandeepok"));
	}

//  for invalid ground name
	@Test
	public void testInvalidName() {

		try {
			GroundDetailsValidator.groundnameValidator(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name cannot be empty or null", ex.getMessage());
		}

		try {
			GroundDetailsValidator.groundnameValidator("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The name should be  minimum 2 letters and maximum 35 letters", ex.getMessage());
		}

	}

//  for valid groundarea
	@Test

	public void testValidareaName() {
		Assertions.assertTrue(GroundDetailsValidator.groundareaValidator("sandeepok"));
	}

//  for invalid groundarea
	@Test
	public void testInvalidareaName() {

		
		try {
			GroundDetailsValidator.groundareaValidator(null);
			Assertions.fail("Validatemainarea name failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("main area cannot be empty or null", ex.getMessage());
		}
		try {
			GroundDetailsValidator.groundareaValidator("a");
			Assertions.fail("Validatemainarea name failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The main area name should be  minimum 2 letters and maximum 27 letters",
					ex.getMessage());
		}

	}

//  for valid groundaddress
	@Test

	public void testValidaddress() {
		Assertions.assertTrue(GroundDetailsValidator.groundaddressValidator("Hellohellook"));
	}

//  for invalid groundaddress
	@Test
	public void testInvalidaddress() {

		try {
			GroundDetailsValidator.groundaddressValidator(null);
			Assertions.fail("Validateaddress failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("address cannot be empty or null", ex.getMessage());
		}
		

		try {
			GroundDetailsValidator.groundaddressValidator("a");
			Assertions.fail("Validateaddress failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The address should be  minimum 10 letters and maximum 150 letters",
					ex.getMessage());
		}

	}

//  for valid groundLocationLink
	@Test

	public void testValidlocation() {
		Assertions.assertTrue(GroundDetailsValidator.groundLocationLink("http://google.com"));
	}

//  for invalid groundLocationLink
	@Test
	public void testInvalidlocation() {

		try {
			GroundDetailsValidator.groundLocationLink(null);
			Assertions.fail("Validatelocation failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("location cannot be empty or null", ex.getMessage());
		}
		try {
			GroundDetailsValidator.groundLocationLink("a");
			Assertions.fail("Validatelocation failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("It should be in url format", ex.getMessage());
		}

	}

//  for valid districtname
	@Test

	public void testValiddistrict() {
		Assertions.assertTrue(GroundDetailsValidator.districtnameValidator("sandeepok"));
	}

//  for invalid districtname
	@Test
	public void testInvaliddistrict() {

		try {
		
		GroundDetailsValidator.districtnameValidator(null);
		Assertions.fail("Validatedistrictname failed");
	} catch (IllegalArgumentException ex) {
		Assertions.assertEquals("district cannot be empty or null", ex.getMessage());
	}

		try {
			GroundDetailsValidator.districtnameValidator("1");
			Assertions.fail("Validatedistrictname failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The district name should be  minimum 2 letters and maximum 35 letters", ex.getMessage());
		}

	}

	
//  for valid groundImages
	@Test

	public void testValidimages() {
		List<String> validImages = Arrays.asList("https://example.com/image1.jpg", "https://example.com/image2.jpg");

		Assertions.assertDoesNotThrow(() -> {
			GroundDetailsValidator.groundImagesValidator(validImages);
		});

	}

//  for invalid groundImages
	@Test
	public void testInvalidimages() {

		List<String> invalidImages = Arrays.asList("image1.jpg", "https://example.com/image2.jpg",
				"https://example.com/image3");


		try {
			GroundDetailsValidator.groundImagesValidator(invalidImages);
			Assertions.fail("Validateimages failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid image URL format", ex.getMessage());
		}

	}

//  for valid sportsAvailable
	@Test

	public void testValidsports() {
		List<String> validsports = Arrays.asList("cricket", "football", "tennis");

		Assertions.assertDoesNotThrow(() -> {
			GroundDetailsValidator.sportsAvailableValidator(validsports);
		});
	}

//  for invalid sportsAvailable
	@Test
	public void testInvalidsports() {

		List<String> invalidsports = Arrays.asList();

		try {
			GroundDetailsValidator.sportsAvailableValidator(invalidsports);
			Assertions.fail("Validatesports failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("No sport selected", ex.getMessage());
		}


	}


//  for valid startTime
	@Test

	public void testValidstarttime() {
		Assertions.assertTrue(GroundDetailsValidator.startTimeValidator("12:00"));
	}

//  for invalid startTime
	@Test
	public void testInvalidstarttime() {
		try {
			GroundDetailsValidator.startTimeValidator(null);
			Assertions.fail("Validatetime failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("time cannot be empty or null", ex.getMessage());
		}

	}
       
//  for valid endTime
	@Test

	public void testValidendtime() {
		Assertions.assertTrue(GroundDetailsValidator.endTimeValidator("12:00"));
	}

//  for invalid endTime
	@Test
	public void testInvalidendtime() {
		try {
			GroundDetailsValidator.endTimeValidator(null);
			Assertions.fail("Validatetime failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("time cannot be empty or null", ex.getMessage());
		}

	}

//  for valid groundRules
	@Test

	public void testValidrules() {
		Assertions.assertTrue(GroundDetailsValidator.groundRulesValidator("hellohellook"));
	}

//  for invalid groundRules
	@Test
	public void testInvalidrules() {


		try {
			GroundDetailsValidator.groundRulesValidator("sssdd");
			Assertions.fail("Validaterules failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The groundRules should be  minimum 10 letters and maximum 150 letters",
					ex.getMessage());
		}
	}
	
	
	
	public void  testInvalidrulesnull() {
		
		try {
			GroundDetailsValidator.groundRulesValidator(null);
			Assertions.fail("Validaterules failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("rules field cannot be empty or null", ex.getMessage());
		}
		
		
	}

//  for valid price
	@Test

	public void testValidprice() {
		Assertions.assertTrue(GroundDetailsValidator.priceValidator(200));
	}

//  for invalid price
	@Test
	public void testInvalidprice() {
		try {
			GroundDetailsValidator.priceValidator(90);
			Assertions.fail("Validateprice failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("price should be between 150 and 2000", ex.getMessage());
		}

	}

//  for valid price
	@Test

	public void testValidincreaseprice() {
		Assertions.assertTrue(GroundDetailsValidator.increasingPriceForExtraHoursValidator(200));
	}

//  for invalid price
	@Test
	public void testInvalidincreaseprice() {
		try {
			GroundDetailsValidator.increasingPriceForExtraHoursValidator(89);
			Assertions.fail("Validateprice failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("increasingPriceForExtraHours should be between 150 and 2000", ex.getMessage());
		}

	}

//  for valid courts
	@Test

	public void testValidcourt() {
		Assertions.assertTrue(GroundDetailsValidator.courtsAvailableValidator(6));
	}

//  for invalid courts
	@Test
	public void testInvalidcourt() {
		try {
			GroundDetailsValidator.courtsAvailableValidator(4);
			Assertions.fail("Validatecourts failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid number of courts available", ex.getMessage());
		}

	}

}
