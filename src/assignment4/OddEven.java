package assignment4; // package declaration is necessary
import java.util.Scanner; // import Scanner class

public class OddEven 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		int x,y;
		
		Scanner input=new Scanner(System.in); // Scanner object to take the input from the user.
		System.out.println("Enter first Number:");
		x=input.nextInt(); // initializing first variable
		System.out.println("Enter Second Number:");
		y=input.nextInt(); // initializing second variable
		
		
		while(x<=y)
		{
			
			if(x%2!=0) // check if number is not divisible by 2
			{
				System.out.println("ODD : " +x); // printing Odd numbers
			}
			else
			{
				System.out.println("EVEN : " +x); // printing Even numbers
			}
			x++;
		}
		input.close();
	}

}
