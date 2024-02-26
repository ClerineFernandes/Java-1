package scanner;

import java.util.Scanner;

public class Scanner1 
{
	static void Addition() 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a=s1.nextInt();
	System.out.println("Enter the value of b:");
	int b=s1.nextInt();
	System.out.println("Sum of Two number:");
	int sum=a+b;
	System.out.println(sum);
	}
	static void Multiply() 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a=s1.nextInt();
	System.out.println("Enter the value of b:");
	int b=s1.nextInt();
	System.out.println("Sum of Two number:");
	int sum=a*b;
	System.out.println(sum);
	}
	static void Substraction() 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a=s1.nextInt();
	System.out.println("Enter the value of b:");
	int b=s1.nextInt();
	System.out.println("Sum of Two number:");
	int sum=a-b;
	System.out.println(sum);
	}

	public static void main(String[] args)
	{
		Addition();
		Substraction();
		Multiply();
		
		

	}

}
