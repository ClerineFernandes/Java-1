package Exm_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exce {

	public static void main(String[] args)
	{
		
		try
		{
			Scanner s1=new Scanner(System.in);
			int age=s1.nextInt();
		   int a=1/0;
		   System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Print");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("Print2");
		}
		
	}

}
