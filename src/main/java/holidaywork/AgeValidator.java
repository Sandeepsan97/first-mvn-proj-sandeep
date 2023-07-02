package holidaywork;

import java.time.LocalDate;
import java.time.Period;

public class AgeValidator {
	public static int calcualteAge(String input)throws IllegalArgumentException{
		
		try {
			
			LocalDate dateOfBirth = LocalDate.parse(input);
			LocalDate currentDate=LocalDate.now();
			
			Period period=Period.between(dateOfBirth, currentDate);
			return period.getYears();
		}
		catch(Exception ex){
			throw new IllegalArgumentException("Invalid date format. Please enter the date in YYYY-MM-DD format.");
			
			
		}
	}

}
