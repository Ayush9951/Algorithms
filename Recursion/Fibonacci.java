/*    
	numbers =  0,1,1,2,3,5...n  
    		   1,2,3,4,5,6...n  for n = 1 return 0 and for n = 2 return 1	
*/

import java.util.*;
class Fibonacci
{

	static int fib(int n)
	{

		if(n == 1)
		{
			return 0;
		}
		if(n == 2)
		{
			return 1;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}

	}

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n=sc.nextInt();

		int result = fib(n);

		System.out.println(n + "th fibonacci number is " + result);

	}

}