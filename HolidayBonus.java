/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ryan Vanathayan
*/

public class HolidayBonus {

	//Attributes
	final static double HIGHEST_SOLD = 5000, LOWEST_SOLD = 1000, BONUS = 2000;
	
	//Constructor
	public HolidayBonus() {
		
	}

	//Methods
	public static double[] calculateHolidayBonus(double[][] data) {
			
		double[] array = new double[data.length];
		
		for(int i = 0; i < data.length; i++){

			double total = 0;

			for(int n = 0; n < data[i].length; n++) {
				
				if(TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, n) == i)			
					total += HIGHEST_SOLD;
				
				else if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, n) ==i)
					total += LOWEST_SOLD;	
				else
					total += BONUS;
			}
			
			array[i] = total;
		}
		
		return array;
	}

	public static double calculateTotalHolidayBonus(double[][] data) {
		double holidayBonuses = 0;
		
		for(int i = 0; i < data.length; i++) {
			
			for(int n = 0; n < data[i].length; n++) {
				if(TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, n) == i)
					holidayBonuses += HIGHEST_SOLD;
				else if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, n) == i)				
					holidayBonuses += LOWEST_SOLD;
				
				else
					holidayBonuses += BONUS;
			}
		}
		return holidayBonuses;
	}
	
	
	
	
	
}