package scanner;

import java.util.Scanner;

public class Scanner5 
{
	static int a;
	static int b;
	static void add()
	{
		int  sum=a+b;
		System.out.println(sum);
		
	}
	static void Substract()
	{
		int sum=a-b;
		System.out.println(sum);
		
	}
	static void Multiply()
	{
		 int  sum=a*b;
		System.out.println(sum);
		
	}
	static void Divide()
	{
		int sum=a%b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		 a=s1.nextInt();
		System.out.println("Enter the value of b:");
		 b=s1.nextInt();
		System.out.println("Addition:");
		add();
		System.out.println("Subtraction:");
		Substract();
		System.out.println("Multiplication:");
		Multiply();
		System.out.println("Division:");
		Divide();

	}

}
