import java.util.*;

class Bubble_Sort
{

    static void bubbleSort(int marks[])
    {

        for(int i = 0; i < marks.length-1; i++)
        {
            for(int j = i + 1; j < marks.length; j++)
            {
                if(marks[i] > marks[j])
                {
                    int t = marks[i];
                    marks[i] = marks[j];
                    marks[j] = t;
                }
            }
        }

        for(int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }

    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

	int marks[] = new int[size];

	System.out.println("Enter marks : ");

        for(int i = 0; i < size; i++)
        {
            marks[i] = sc.nextInt();
        }

        System.out.print("Sorted Marks : ");
        
        bubbleSort(marks);

    }

}