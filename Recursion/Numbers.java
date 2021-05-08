/*

     [Num(1)] s.o.p(1)
     [Num(2)] s.o.p(2)
     [Num(3)] s.o.p(3)
     [main()]

*/

import java.util.*;
class Numbers
{

	static void Num(int n)
	{

		if(n == 0)
		{
			return;
		}
		else
		{
			Num(n-1);
			System.out.print(n+" ");   // 1,2,3
		}

	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		System.out.print("First " + n + " natural numbers are : ");

		Num(n);

	}
	
}