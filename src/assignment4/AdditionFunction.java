package assignment4; // package declaration is necessary 
import java.util.Scanner; // import Scanner class

public class AdditionFunction 
{

	// function for calculating sum of two numbers
	public int sum(int x,int y)
	{
		return (x+y);
	}
	public static void main(String[] args)  // main method starts
	{
		// TODO Auto-generated method stub
		int x,y;
		
		Scanner input=new Scanner(System.in); // Scanner object to take the input from the user.
		System.out.println("Enter first Number:");
		x=input.nextInt(); // initializing first variable
		System.out.println("Enter Second Number:");
		y=input.nextInt(); // initializing second variable
		
		input.close();
		
		AdditionFunction obj = new AdditionFunction(); // creating object of class AdditionFunction
		
		System.out.println("Sum of "+x+" and "+y+" = "+obj.sum(x, y)); // calculating the sum and printing the sum
	}

}
