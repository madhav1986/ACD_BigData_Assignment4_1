package assignment4; // package declaration is necessary 
import java.util.Scanner; // import Scanner class

public class NumberTable 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		// declare variables
		int number;
		Scanner input=new Scanner(System.in); // Scanner object to take the input from the user.
		System.out.println("Enter the number :");
		number=input.nextInt(); // initializing first variable
		input.close();
		
		System.out.println("First 10 multiples of number are :");
		
		// logic for calculating calculating number table 
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+" * "+i+" = "+number*i);
		}

	}

}
