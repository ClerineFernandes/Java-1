package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proram1 
{
	

	public static void main(String[] args) 
	{
		try
		{
		Scanner s1=new Scanner(System.in);
	
		int a=s1.nextInt();
		
		
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Hello");
		}
		catch(NullPointerException a2)
		{
			System.out.println("Ho");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("Hofefef");
		}
	}
}
		

	

