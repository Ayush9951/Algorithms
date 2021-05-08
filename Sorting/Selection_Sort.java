/*

	Find the minimum element in the unsorted array and swap it 
	with the first element of the unsorted array
	Repeat the above step till the array becomes sorted

	Note that we are not swapping with first element of the array 
	but swapping with first element of the unsorted array

*/

import java.util.*;
class Selection_Sort
{

	static void Sort(int marks[])
	{

		for(int i = 0; i < marks.length - 1; i++)	  
		{
			int min = marks[i];	 				
			int min_index = i;  

			for(int j = i + 1; j < marks.length; j++)
			{
				if(min > marks[j])
				{
					min = marks[j];
					min_index = j;
				}
			}

			int t = marks[i];  
			marks[i] = min; 
			marks[min_index] = t;  	
		}

		for(int i = 0; i < marks.length; i++)
		{
			System.out.print(marks[i] + " ");
		}

	}

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int marks[] = new int[size];

		System.out.println("Enter marks : ");

		for(int i = 0; i < size; i++)
		{
			marks[i] = sc.nextInt();
		}

		System.out.print("Sorted Marks : ");

		Sort(marks);

	}

}