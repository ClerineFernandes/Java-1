package package3;

import java.util.Scanner;

public class throwone 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s1.nextInt();
		if(age>18)
	 
		{
			
			System.out.println("Access google");
		}
		else
		{
			;
		throw new ArithmeticException("You are a kid");
		

	}
	}
}


