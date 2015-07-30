import java.text.*;
/*
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author Derek
 *
 */
public class Problem_4 {
	
	public static void main(String[] args)
	{
		// declarations and benchmark setter
		long startTime = System.currentTimeMillis();
		int num1;
		int num2;
		int product;
		int maxProduct = 0;
		String strProduct;
		
		final int LOWEST_THREE_DIGIT_NUMBER = 100;
		final int LOWEST_FOUR_DIGIT_NUMBER = 1000;

		// For loop that iterates every integer from 100 to 999 (every three digit number)
		for(int i = LOWEST_THREE_DIGIT_NUMBER; i < LOWEST_FOUR_DIGIT_NUMBER; i++)
		{
			// stores iterated integer into the global num1 int variable
			num1 = i;
			/*
			 * For loop iterates through every three digit number again
			 * However, this is nested within the previous For loop
			 * This is so we can make every multiplication possible and find every
			 * product that is created from two 3 digit numbers
			 */
			for(int k = LOWEST_THREE_DIGIT_NUMBER; k < LOWEST_FOUR_DIGIT_NUMBER; k++)
			{
				// stores iteration into the global num2 int variable
				num2 = k;
				/*
				 * after it stores the iteration, it multiplies the factors and
				 * stores the product in the global product int variable
				 */
				product = num1 * num2;
				/* 
				 * converts the integer variable into a string so that
				 * we can use compare methods to evaluate each character
				 */
				strProduct = Integer.toString(product);
				/*
				 * both declares and initializes the counter variable
				 * because we've declared it in this step, it is a local
				 * variable and thus gets emptied after each pass-through
				 * of the For loop, if we chose to make the counter a global variable,
				 * we would need to remember to reset it back to 0 when we're done with it
				 */
				int counter = 0;
				/*
				 * For loop that iterates every character on the left-hand side of
				 * the number. it will stop half-way. 
				 */
				for(int m = 0; m < ( strProduct.length() / 2 ); m++)
				{
					/*
					 * if the iterated character matches that of the opposite side,
					 * the counter will increase by one
					 */
					if(strProduct.charAt(m) == strProduct.charAt(strProduct.length() - 1 - m))
						counter++;
				}
				/*
				 * if the counter ends up being the same value as half of the
				 * length of the number (meaning every character was equal to the
				 * character on the opposite side), AND if the number is higher 
				 * than the previous number who also met this criteria, the number
				 * gets stored in the global maxProduct int variable
				 */
				if(counter == ( strProduct.length() / 2 ))
				{
					if(product > maxProduct)
						maxProduct = product;
				} 
			}
		}
		// then we print it to the console :)
		System.out.println("The largest three digit palindrome is " + maxProduct + "!");
		
		// ends benchmark to find how long the code took to execute
		NumberFormat formatter = new DecimalFormat("#0.00000");
		long endTime   = System.currentTimeMillis();
		System.out.println("\nThis program took " + ( endTime - startTime ) / 1000d + " seconds to compute.");
	}
}
