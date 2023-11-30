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
import java.util.Scanner;
import java.io.*;

public class TwoDimRaggedArrayUtility {

	//Constructor
	TwoDimRaggedArrayUtility(){
		
	}

	//Methods
	public static double getAverage(double[][] data) {
	
		int counter = 0;
		double total = 0.0;
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				total += data[row][col];
				counter++;
			}
				
		}
		return total/counter;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		
		double total = 0.0;
		
		for(int row = 0; row < data.length; row++) {
			for(int i = 0; i < data[row].length; i++) {
				if(col == i)
					total += data[row][i];
			}
		}
		return total;
	}
	
	public static double getHighestInArray(double[][] data) {
		
		double total = 0.0, highest = data[0][0];
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				if(data[row][col] > highest)
					highest = data[row][col];
			}
		}
		
		return highest;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		
		double highest = data[0][col];
		
		for(int row = 0; row < data.length; row++) {
			for(int i = 0; i < data[row].length; i++) {
				if(col == i) {
					if(data[row][i] > highest)
						highest = data[row][i];
				}
			}
		}
		return highest;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
		
		double highest = data[0][col];
		int index = 0;
		
		for(int row = 0; row < data.length; row++) {
			for(int i = 0; i < data[row].length; i++) {
				if(col == i)
				{
					if(data[row][i] > highest) {
						highest = data[row][i];
						index = row;
					}
				}
			}
		}
		return index;
	}

	public static double getHighestInRow(double[][] data,int row) {
		
		double highest = data[row][0];
		
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highest)
				highest = data[row][i];
		}
		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		
		double highest = data[row][0];
		
		int index = 0;
		
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highest) {
				highest = data[row][i];
				index = i;
			}
		}
		return index;
	}
	
	public static double getLowestInArray(double[][] data) {
		
		double total = 0.0, lowest = data[0][0];
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				if(data[row][col] < lowest)
					lowest = data[row][col];
			}
		}
		
		return lowest;
	}
	
	public static double getLowestInColumn(double[][] data, int col) {
		
		double lowest = data[0][col];
		
		for(int row = 0; row < data.length; row++) {
			for(int i = 0; i < data[row].length; i++) {
				if(col == i) {
					if(data[row][i] < lowest)
						lowest = data[row][i];
				}
			}
		}
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		
		double lowest = data[0][col];
		int index = 0;
		
		for(int row = 0; row < data.length; row++) {
			for(int i = 0; i < data[row].length; i++) {
				if(col == i)
				{
					if(data[row][i] < lowest) {
						lowest = data[row][i];
						index = row;
					}
				}
			}
		}
		return index;
	}

	public static double getLowestInRow(double[][] data, int row) {
		
		double lowest = data[row][0];
		
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < lowest)
				lowest = data[row][i];
		}
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		
		double lowest = data[row][0];
		
		int index = 0;
		
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < lowest) {
				lowest = data[row][i];
				index = i;
			}
		}
		return index;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		
		double total = 0.0;
		
		for(int i = 0; i < data[row].length;i++) 
			total += data[row][i];
		
		return total;
	}

	public static double getTotal(double[][] data) {
		
		double total = 0.0;
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col ++)
				total += data[row][col];
			
		}
		
		return total;
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException {
		
		try {
			final int MAX_ROW = 10, MAX_COLUMN = 10;
			int rows = 0;
			
			String str[][] = new String[10][10];
			
			Scanner sc = new Scanner(file);
			
			
			while(sc.hasNextLine()){
	            
				sc.nextLine();
	            
				rows++;
	
			}
			
			for(int i = 0; i < rows; rows++) {
				
				String[] numbers = sc.nextLine().split(" ");
				
				str[i] = numbers;
			}
			
			double array[][] = new double[rows][];
			
			for(int i = 0; i < rows; i++) {
				
				int cols = str[i].length;
				
				array[i] = new double[cols];
				
				for(int n = 0; n < cols; n++) {
					
					array[i][n] = Double.parseDouble(str[i][n]);
				}
			}
			
			sc.close();
			return array;
		}
		catch(IOException io) {
			io.printStackTrace();
			return null;
		}
		
	}

	public static void writeToFile(double[][] data, File outputFile) 
			throws FileNotFoundException, IOException {
		
		FileWriter inputFile = new FileWriter(outputFile, true);
		
		PrintWriter output = new PrintWriter(inputFile);
		
		for(int i = 0; i < data.length; i++) {
			
			for(int n = 0; n < data[i].length; n++) {
				
				output.print(data[i][n]);
				
				if(n != data[i].length - 1)
					output.print(" ");
			}
			
			output.print("\n");
		}
	}
	
	
	
}
