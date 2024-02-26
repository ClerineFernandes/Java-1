package scanner;

import java.util.Scanner;

public class Scanner4 
{
	static int a;
	static int b;
	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtract()
	{
		int sum=a-b;
		System.out.println(sum);
	}
	static void multiply()
	{
		int sum=a*b;
		System.out.println(sum);
	}
	static void divide()
	{
		int sum=a%b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=s1.nextInt();
		System.out.println("Enter the value of b");
		b=s1.nextInt();
		System.out.println("Addition");
		add();
		System.out.println("Subtraction");
		subtract();
		System.out.println("Multiplication");
		multiply();
		System.out.println("Division");
		divide();
		
		
		

	}

}
