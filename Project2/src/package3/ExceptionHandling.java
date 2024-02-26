package package3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
			Scanner s1=new Scanner(System.in);
			//int c=1/0;
			int a=s1.nextInt();
		}
		catch(ArithmeticException a1)
		{
			System.out.println("HEYA");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("Ho");
		}
		finally
		{
			System.out.println("Finally");
		}
		
	}

}
