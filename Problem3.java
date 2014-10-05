
/* 
 * Project Euler Problem Set 3
 * http://projecteuler.net/problem=3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * 
 * How I approached this problem:
 * 
 * First function uses for loop to find the factors of a number
 * and then pushes them into an array. Second calls function and 
 * scans inside, printing out every item. 
 * 
 * OUTPUT:
 * 71
 * 839
 * 1471
 * 6857
 * 
 * Therefore, highest prime factor is 6857
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Problem3
{
	public static List<Long> factors(long num)
	{
		List<Long> factors = new ArrayList<Long>();
		for(long i = 2; i <= num; i++)
			while(num % i == 0)
			{
				factors.add(i);
				num /= i;
			}
		return factors;
	}
	public static void main(String args[])
	{
		long numbers = 600851475143L;
		for(long lon : factors(numbers))
		{
			System.out.println(lon);
		}
	}

}

