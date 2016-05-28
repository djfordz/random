package grades;
import java.util.*;
import java.lang.*;
/**
 * 
 * @author Matthew Ford
 *
 */
public class GradeAverage {
	public static void main(String[] args)
	{
		// Instantiate variables.
		String input;
		float grade;
		float[] grades;
		float average;
		int total;
		int count; 
	
		// Initialize variables.
		total = 0;
		count = 0;
		average = 0;
		ArrayList<Float> inputList= new ArrayList<Float>();
	
		// Instantiate scanner.
		Scanner in = new Scanner(System.in);
	
		while(true)
		{
			// Ask for user input.  
			System.out.println("Please input a grade between 0 and 100 inclusive. Press ENTER to End.");
			input = in.nextLine();
			
			if(input.equals(""))
			{
				break;
			}
			try
			{
				// Attempt to change string to float.
				grade = Float.parseFloat(input);
				
				//If error skip to catch.
				
				// Check to see if input is between 0 and 100 inclusive
				if(grade >= 0 && grade <= 100)
				{
					
					inputList.add(grade);
					total += grade;
					count++;
					average = total / count;
				}
				// If number not between 0 and 100 inclusive.
				else
				{
					System.out.println("Number Not Valid");
					
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Not a legal number. Try again.");
			}
		}
		// Initialize array.
		grades = new float[count];
		
		//print individual grades and quality points.
		for(int i = 0; i < count; i++)
		{
			// Store arraylist in array.
			grades[i] = inputList.get(i).floatValue();
			// Print individual grades.
			System.out.printf("Quality points for %.0f is %d%n", grades[i], qualityPoints(grades[i]) );
		}
		
		// Print average of grades and quality points.
		System.out.printf("The average of grades entered is %.2f and the quality points for the average %.2f is %d%n", average, average, qualityPoints(average));
		
		in.close();
	}
	
	// Method to return quality points given an input.
	public static int qualityPoints(float avg)
	{
		if(avg >= 90 && avg <= 100)
		{
			return 4;
		}
		else if(avg >= 80 && avg < 90)
		{
			return 3;
		}
		else if(avg >= 70 && avg < 80)
		{
			return 2;
		}
		else if(avg >= 60 && avg < 70)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
