package assignment4; // package declaration is necessary 
import java.util.Scanner; // import Scanner class
public class Addition 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		// Declare variables
		int x,y;
		Scanner input=new Scanner(System.in); // Scanner object to take the input from the user.
		System.out.println("Enter first Number:");
		x=input.nextInt(); // initializing first variable
		System.out.println("Enter Second Number:");
		y=input.nextInt(); // initializing first variable
		
		input.close();
		
		System.out.println("Sum of "+x+" and "+y+" = "+(x+y)); // calculating the sum and printing the sum
	}

}
