import java.text.NumberFormat;

/**
 * 
 * @author Derek Fermaint
 * Project Euler # 6
 ***************** DISCLAIMER ***************** 
 * This program is written so you can find the difference between the sum of squares and the square of the sum of
 * ANY number, simply call the class and enter your new variable.
 *
 *The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * * Beginning psuedocode:
 * * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * * array of 100 natural numbers
 * * iterate through each, raise to second power and add each
 * * array of 100 natural numbers
 * * sum each one, raise the sum by power of two
 * * minus second sum by first sum
 */
public class Euler6 {
	private int differenceOfSums;
	private int sumSquares = 0;
	private int squareSums = 0;
	private int num1 =       0;
	private int num2 =       0;
	private int FIRST_X_NATURAL_NUMBERS;
	
	private int[] sumSquaresArray = new int[FIRST_X_NATURAL_NUMBERS];
	private int[] squareOfSumArray = new int[FIRST_X_NATURAL_NUMBERS];
	
	NumberFormat nf = NumberFormat.getNumberInstance();
	
	/**
	 * Represents program
	 * @constructor
	 * @param number natural variable of number to find sum
	 */
	Euler6(int number)
	{
		FIRST_X_NATURAL_NUMBERS = number;
	}
	
	/**
	 * @{#} = code line number / location
	 * Iterates through FIRST_X_NATURAL_NUMBERS (entered variable)
	 * @{70} puts 1-(max number entered) into an array (sumSquaresArray)
	 * @{71} does the same exact thing as @{70}, but in a different array (squareOfSumArray)
	 * @{73} puts the element of the specific indexed location the for loop is currently at, into an int variable (num1) 
	 * @{74} does the same exact thing as @{73}, but in a different array (num2)
	 * @{76} takes each iteration of (num1) and squares it, stores it back into (num1)
	 * @{78} adds each iteration and the last iteration together, summing up each squared term and stores them in (sumSquares)
	 * @{79} sums each iteration of (num2) but NOTE: does not square them until outside of the for loop
	 * @{82} takes the sum of (squareSums) and squares it, stores it back into (squareSums)
	 * @{84} finds the difference between square of the sum, and sum of the squares, stores them in (differenceOfSums)
	 * @{86} displays context string for user to console
	 * @{87} displays the difference for user to console                 
	 * 
	 */
	public void differenceOfSumSquares()
	{
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
		
		differenceOfSums = squareSums - sumSquares;
		
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: ");
		System.out.println(nf.format(differenceOfSums));
		
	}
}
