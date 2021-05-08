/*
	For Binary Search to work the Array Should always be in the sorted order
*/

import java.util.*;
public class Binary_Search
{

	static int Search(int studentIds[], int Id)
	{

		int start = 0; 				
		int end = studentIds.length-1; 		

			while(start <= end)
			{

				int mid = (start + end) / 2;

				if(Id == studentIds[mid])
				{
					return studentIds[mid];
				}
				else if(Id < studentIds[mid])
				{
					end = mid - 1;
				}
				else if(Id > studentIds[mid])
				{
					start = mid + 1;
				}

			}

			return -1;   	// Id Not Found
		
	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int studentIds[] = new int[size];

		System.out.println("Enter Id's : ");

		for(int i = 0; i < size; i++)
		{
			studentIds[i] = sc.nextInt();
		}

		System.out.print("Enter Id you want to search : ");
		int Id = sc.nextInt();

		int result = Search(studentIds, Id);

		if(result == -1)
		{
			System.out.print("Id " + Id + " not found ");
		}
		else
		{
			System.out.print("Id " + Id + " found ");
		}
		
	}

}