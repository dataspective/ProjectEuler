import java.text.*;
import java.util.Scanner;

/*
 * @author Derek Fermaint
 * Project Euler # 6
 ***************** DISCLAIMER ***************** 
 * This program is written so you can find the difference 
 * between the sum of squares and the square of the sum of
 * ANY number, simply call the class and enter your new variable.
 *
 *The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of 
 * the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares 
 * of the first one hundred natural numbers and the square of the sum.
 * 
 */
public class Problem_6 {
	
	public static void main(String[] args)
	{
		//--- DECLARATIONS ---//
		int differenceOfSums;
		int sumSquares = 0;
		int squareSums = 0;
		int num1 =       0;
		int num2 =       0;
		int FIRST_X_NATURAL_NUMBERS;
		
		//--- USER INPUT ---//
		Scanner in = new Scanner(System.in);
		// gets user input
		System.out.println("Enter natural number (integer): ");
		// while loop that loops back until a proper input is received (integer)
		while(in.hasNextInt() == false)
		{
			System.out.println("Input error, please enter natural number (integer): ");
			in.next();
		}
		// assigns valid user input to variable
		FIRST_X_NATURAL_NUMBERS = in.nextInt();

		// creates two arrays with input size
		int[] sumSquaresArray = new int[FIRST_X_NATURAL_NUMBERS];
		int[] squareOfSumArray = new int[FIRST_X_NATURAL_NUMBERS];
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		
		//--- COMPUTATION ---//
		/*
		 * For loop that iterates through the user input number
		 * and both finds the square of the sums and the 
		 * sum of the squares. 
		 */
		long startTime = System.currentTimeMillis();
		for(int i = 0; i <= FIRST_X_NATURAL_NUMBERS - 1; i++)
		{
			sumSquaresArray[i] = i + 1;
			squareOfSumArray[i] = i + 1;
			
			num1 = sumSquaresArray[i];
			num2 = squareOfSumArray[i];
			
			num1 = (int) Math.pow(num1, 2);
				
			sumSquares += num1;
			squareSums += num2;
		}
		
		squareSums = (int) Math.pow(squareSums, 2);
		
		// finds the difference between the square of the sums and sum of squares
		differenceOfSums = squareSums - sumSquares;
			
		// prints result to the console
		System.out.println("The difference between the sum of the "
				+ "squares of the first "+ FIRST_X_NATURAL_NUMBERS + " natural "
				+ "numbers and the square of the sum is: ");
		System.out.println(nf.format(differenceOfSums));
		
		// prints to console time of computation
		NumberFormat formatter = new DecimalFormat("#0.00000");
		long endTime   = System.currentTimeMillis();
		System.out.println("\nThis program took " + ( endTime - startTime ) / 1000d + " seconds to compute.");
			
	}
}
