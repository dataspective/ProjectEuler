import java.text.*;
/**
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by 
 * all of the numbers from 1 to 20?
 * @author Derek
 *
 */
public class Problem_5 {
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		int number =                    2520;
		int multiple = 			     	2520;
		int counter =                      0;
		int iterations =                   0;
		final float TWENTY =              20;
		boolean isEvenlyDivisible =    false;

		/*
		 * While loop that iterates up through every number and checks to see
		 * if that number is divisible by 1 to 20. Keeps track of divisibility 
		 * by incrementing a counter variable. While loop stops once a number
		 * that is divisible by all numbers 1 to 20 is found and prints to console
		 */
		while(isEvenlyDivisible != true)
		{
			// counter variable that reitializes back to 0 at each iteration	
			counter = 0;
			/*
			 *  For loop that iterates 1 through 20
			 *  and checks if the current number is evenly divisible
			 *  by the iteration, if so it will increment 
			 *  the counter variable 
			 */
			for(int i = 1; i < TWENTY + 1; i++)
			{
				// checks if current number is evenly divisible
				if(number % i == 0)
				{
					// increments counter variable
					counter++;
				}
			}
			/*
			 * after the process, this logic checks to see 
			 * if the counter variable is at 20 (meaning the number
			 * is evenly divisible by every number 1 to 20. 
			 * if so, it will end the while loop and print to the console.
			 * if not, it will iterate back in the while loop
			 */
			if (counter == TWENTY)
			{
				// sets the boolean variable to true, ending the while loop
				isEvenlyDivisible = true;
				// prints to the console
				System.out.println(number + " is evenly divisible by the numbers 1 to 20.");
				System.out.println("\niterations = " + iterations);
				
				// prints for computation time
				NumberFormat formatter = new DecimalFormat("#0.00000");
				long endTime = System.currentTimeMillis();
				System.out.println("This program took " + ( endTime - startTime ) / 1000d + " seconds to compute.");
			}
			// iterates by 2,520 every loop
			number += multiple;
			// counter to check how many times the while loop iterates
			iterations++;
		}
	}
}
