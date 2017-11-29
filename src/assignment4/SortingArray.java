package assignment4; // package declaration is necessary
import java.util.Arrays; // Import Arrays class
import java.util.Scanner; // Import Scanner class

public class SortingArray 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		
		// declare variables
		int arrSize;
		int i=0;
		int arrElements;
		
		Scanner input=new Scanner(System.in); // Scanner object to take the input from the user.
		System.out.println("Enter the size of array");
		arrSize=input.nextInt(); // Initialize array size
		
		int [] array=new int[arrSize]; // creating array with array size provided by user 
		
		System.out.println("Enter the elements of array");
		
		// loop to initialize array
		while(i<arrSize)
		{
			arrElements=input.nextInt();
			array[i]=arrElements;
			i++;
		}
		
		input.close();
		Arrays.sort(array); // sorting the array
		
		i=0;
		
		System.out.println("Array Elements in sorted order");
		// loop to print sorted array
		while(i<arrSize)
		{
			System.out.println(array[i]);
			i++;
		}

	}

}
