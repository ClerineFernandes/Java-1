package scanner;

import java.util.Scanner;

public class Scanner7
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		if(age>=18)
		{
			System.out.println("Im adult");
		}
		else
		{
			System.out.println("Im still Young");
		}
		

	}

}
