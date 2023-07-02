package com.fssa.sp.holiday.project;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroundDetailsValidator {
	public static boolean validate(GroundDetails ground) {
groundnameValidator(ground.groundName);
groundareaValidator(ground.groundMainArea);
groundaddressValidator(ground.groundAddress);
groundLocationLink(ground.groundLocationLink);
districtnameValidator(ground.district);
groundImagesValidator(ground.groundImages);
sportsAvailableValidator(ground.sportsAvailable);
startTimeValidator(ground.startTime);
endTimeValidator(ground.endTime);
groundRulesValidator(ground.groundRules);
priceValidator(ground.price);
increasingPriceForExtraHoursValidator(ground.increasingPriceForExtraHours);
courtsAvailableValidator(ground.courtsAvailable);


		return true;
	}

//name validate
	public static boolean groundnameValidator(String groundName) throws IllegalArgumentException {
		
		if (groundName == null || "".equals(groundName.trim())) {
			throw new IllegalArgumentException("Name cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z]{2,35}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(groundName);
		Boolean isMatch = matcher.matches();



		 if (!isMatch) {
			throw new IllegalArgumentException("The name should be  minimum 2 letters and maximum 35 letters");

		}

		return true;

	}

	// main area
	public static boolean groundareaValidator(String groundMainArea) throws IllegalArgumentException {
		
		if (groundMainArea == null || "".equals(groundMainArea.trim())) {
			throw new IllegalArgumentException("main area cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z]{2,27}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(groundMainArea);
		Boolean isMatch = matcher.matches();



		if (!isMatch) {
			throw new IllegalArgumentException(
					"The main area name should be  minimum 2 letters and maximum 27 letters");

		}

		return true;

	}

// address
	public static boolean groundaddressValidator(String groundAddress) throws IllegalArgumentException {
		
		if (groundAddress == null || "".equals(groundAddress.trim())) {
			throw new IllegalArgumentException("address cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z0-9\\\\p{Punct}\\\\s]{10,150}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(groundAddress);
		Boolean isMatch = matcher.matches();

	

		if (!isMatch) {
			throw new IllegalArgumentException(
					"The address should be  minimum 10 letters and maximum 150 letters");

		}

		return true;

	}

	public static boolean groundLocationLink(String groundLocationLink) throws IllegalArgumentException {
		
		if (groundLocationLink == null)  {
			throw new IllegalArgumentException("location cannot " + "be empty or null");
		}

		String nameregex =  "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(groundLocationLink);
		Boolean isMatch = matcher.matches();

	

		 if (!isMatch) {
			throw new IllegalArgumentException("It should be in url format");

		}

		return true;

	}

//district validate
	public static boolean districtnameValidator(String district) throws IllegalArgumentException {
		
		if (district == null || "".equals(district.trim())) {
			throw new IllegalArgumentException("district cannot be empty or null");
		}

		String nameregex = "^[a-zA-Z]{2,35}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(district);
		Boolean isMatch = matcher.matches();

	

		if (!isMatch) {
			throw new IllegalArgumentException("The district name should be  minimum 2 letters and maximum 35 letters");

		}

		return true;

	}

//images validate
	public static boolean groundImagesValidator(List<String> groundImages) throws IllegalArgumentException {



//		if (groundImages == null) {
//			throw new IllegalArgumentException("Images cannot " + "be empty or null");
//		}

		 for (String image : groundImages) {
	            String urlRegex = "^https?://[\\w.-]+(?:/\\S*)?$";
	            Pattern pattern = Pattern.compile(urlRegex);
	            Matcher matcher = pattern.matcher(image);
	            if (!matcher.matches()) {
	                throw new IllegalArgumentException("Invalid image URL format");
	            }
	        }

		return true;

	}

//sports validate
	public static boolean sportsAvailableValidator(List<String> sportsAvailable) throws IllegalArgumentException {

		if (sportsAvailable.isEmpty()) {
			throw new IllegalArgumentException("No sport selected");
		}

		// Add validation logic for sports available if needed
		// For example, check if at least one sport is selected
//		for (String sport : sportsAvailable) {
//			if (sport == null || sport.isEmpty()) {
//				 throw new IllegalArgumentException("Invalid sport" + sport);
//			}
//		}

		return true;
	}
	
	
	
	//starttime validate
		public static boolean startTimeValidator(String startTime) throws IllegalArgumentException {


			if (startTime == null) {
				throw new IllegalArgumentException("time cannot be empty or null");
			}


			return true;

		}

	
		//endTime validate
				public static boolean endTimeValidator(String endTime) throws IllegalArgumentException {


					if (endTime == null) {
						throw new IllegalArgumentException("time cannot be empty or null");
					}


					return true;

				}
				
				
				
				
				// groundRules
				public static boolean groundRulesValidator(String groundRules) throws IllegalArgumentException {

					String nameregex = "^[a-zA-Z0-9\\\\p{Punct}\\\\s]{10,250}$";
					Pattern pattern = Pattern.compile(nameregex);
					Matcher matcher = pattern.matcher(groundRules);
					Boolean isMatch = matcher.matches();

					if (groundRules == null || "".equals(groundRules.trim()) || groundRules.length() < 5) {
						throw new IllegalArgumentException("rules field cannot be empty or null");
					}

					else if (!isMatch) {
						throw new IllegalArgumentException(
								"The groundRules should be  minimum 10 letters and maximum 150 letters");

					}

					return true;

				}
				
				
				// price
				public static boolean priceValidator(double price) throws IllegalArgumentException {


					if (price >= 150 && price <= 2000) {
						return true;
					}
					throw new IllegalArgumentException("price should be between 150 and 2000");

				}
						
				

				// increasingPriceForExtraHours
				public static boolean increasingPriceForExtraHoursValidator(double increasingPriceForExtraHours) throws IllegalArgumentException {


					if (increasingPriceForExtraHours >= 150 && increasingPriceForExtraHours <= 2000) {
						return true;
					}
					throw new IllegalArgumentException("increasingPriceForExtraHours should be between 150 and 2000");

				}
						
				
	
				// courtsAvailable
				public static boolean courtsAvailableValidator(int courtsAvailable) throws IllegalArgumentException {

					  List<Integer> validOptions = List.of(6);
					  if (!validOptions.contains(courtsAvailable)) {
					        throw new IllegalArgumentException("Invalid number of courts available");
					    }
					  return true;
				}
						
				
}
