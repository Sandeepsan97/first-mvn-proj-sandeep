package holidaywork;

import java.time.LocalDate;

public class LeapYearValidator {

	
	public static int countLeapYear(int startYear, int endYear) throws IllegalArgumentException{
		if(startYear >endYear) {
			
			throw new IllegalArgumentException("Invalid range: startYear must be less than or equal to endYear.");
		}
			int leapcount=0;
			
			for(int i=startYear;i<=endYear;i++) {
				
				
				if(LocalDate.ofYearDay(i, 1).isLeapYear()) {
					leapcount++;
				}
			}
			
			return leapcount;
		
	
		
	}
}
