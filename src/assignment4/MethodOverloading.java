package assignment4; // package declaration is necessary 
import java.util.Scanner; // import Scanner class

public class MethodOverloading 
{

	// function to calculate sum of two numbers
	public int sum(int x,int y)
	{
		return(x+y);
		
	}
	
	// function to calculate sum of three numbers
	public int sum(int x,int y,int z)
	{
		return(x+y+z);
		
	}
	
	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
	// declare variables
	int x,y,z;
	MethodOverloading obj=new MethodOverloading(); // create object of class MethodOverloading
	
	Scanner input=new Scanner(System.in); // Scanner object to take the input from the user.
	
	System.out.println("Enter first number : ");
	x=input.nextInt(); // initializing first variable
	
	System.out.println("Enter second number : ");
	y=input.nextInt(); // initializing second variable
	
	System.out.println("Enter third number : ");
	z=input.nextInt(); // initializing third variable
	
	input.close();

	System.out.println("Sum of two numbers = "+obj.sum(x,y));
	
	System.out.println("Sum of three numbers = "+obj.sum(x,y,z));
	}

}
