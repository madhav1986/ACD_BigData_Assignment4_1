package assignment4; // package declaration is necessary

public class OverloadingSameReturnType 
{
	// sum function overloading with double data types
	public double sum(double x,double y)
	{
		return(x+y);
	}

	// sum function overloading with int data types
	public double sum(int x,int y)
	{
		return(x+y);
	}

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		// Declare variables
		double x=10.6;
		double y=20.5;
		int a =10;
		int b=45;
		
		OverloadingSameReturnType obj=new OverloadingSameReturnType(); // creating object of class OverloadingSameReturnType
		
		
		System.out.println("Sum of x and y = "+obj.sum(x,y)); // printing sum of numbers with double data type
		
		System.out.println("Sum of a and b = "+obj.sum(a,b)); // printing sum of numbers with int data type

	}

}
