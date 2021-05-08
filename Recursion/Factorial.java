/*
	fact(1) =  return 1
	fact(2) = [fact(2)] return fact(1)*2   i.e  fact(2) will return 1 * 2
	fact(3) = [fact(3)] return fact(2)*3   i.e  fact(3) will return 2 * 3
             	  [main() ] 6
*/

import java.util.*;
class Factorial
{

	static int fact(int n)
	{

		if(n == 1)
		{
			return 1;
		}
		else
		{
			int value = fact(n-1) * n;
			return value;
		}

	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		int result = fact(n);

		System.out.print("Factorial of " + n + " is " + result);

	}

}
