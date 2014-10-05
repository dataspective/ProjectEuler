
/* 
 * Project Euler Problem Set 1
 * http://projecteuler.net/problem=1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * 
 *  >> Find the sum of all the multiples of 3 or 5 below 1000. 
 * 
 * */

/* 
 * How I approached this problem:
 * 
 * For loop constraint to 1,000 and allowed loop to ascend in iterations 1++. 
 * Wrote if statement to return multiples of 3 and 5 into array.
 * 
 */

import java.util.ArrayList;
import java.util.List;


public class Problem1
{

	public static void main(String[] args)
	{
		List<Integer> multiplesArray = new ArrayList<Integer>(500);
		for(int count=0; count <= 1000; count++ ) 
		{	
			if(count % 3 == 0 || count % 5 == 0)
			multiplesArray.add(count);
        }
			int sum1 = 0;
		    for (int i : multiplesArray) sum1 += i;

/* 
 * This includes sum of multiples of 3 or 5 or both, so further code is needed:
 * 
 * Ran similar for loop for multiple of 3 * 5 (15) and subtracted from initial loop 
 * 
 */		    
		    
		List<Integer> multiplesArray1 = new ArrayList<Integer>(500);
		for(int count=0; count <= 1000; count++ ) 
			{	
				if(count % 15 == 0)
				multiplesArray1.add(count);
	        }
				int sum2 = 0;
			    for (int i : multiplesArray1) sum2 += i;
			    System.out.println(sum1 - sum2);
			    
			    
    }
}


/* 
 * Thus I got 201,003. I have seen other solutions on stack overflow but found this to be optimal for problem statement
 */	
