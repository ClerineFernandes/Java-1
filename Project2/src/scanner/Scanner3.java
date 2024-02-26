package scanner;

import java.util.Scanner;

public class Scanner3 
{
	static void Addition()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		System.out.println("Addition");
		int sum=a+b;
		System.out.println(sum);
	}
	static void Subtract()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		System.out.println("Subtraction");
		int sum=a-b;
		System.out.println(sum);
	}
	static void Multiply()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		System.out.println("Multiplication");
		int sum=a*b;
		System.out.println(sum);
	}
	static void Division()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		System.out.println("Divisionn");
		int sum=a%b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Addition();
		Subtract();
		Multiply();
		Division();
		
		
		
	}

}
