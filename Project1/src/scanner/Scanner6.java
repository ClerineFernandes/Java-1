package scanner;

import java.util.Scanner;

import constructor.GlobalVariable;

public class Scanner6 {
	static int a;
	static int b;
	static void Add()
	{
		Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			int a=s1.nextInt();
			System.out.println("Enter the value of b:");
			int b=s1.nextInt();
			System.out.println("Addition:");
			int sum=a+b;
			System.out.println(sum);
	}
	
		static void Subtract()
		{ Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			int a=s1.nextInt();
			System.out.println("Enter the value of b:");
			int b=s1.nextInt();
			System.out.println("Subtraction:");
			int sum=a-b;
			System.out.println(sum);
		}
		static void Multiply()
		{ Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			int a=s1.nextInt();
			System.out.println("Enter the value of b:");
			int b=s1.nextInt();
			System.out.println("Multiplication:");
			int sum=a*b;
			System.out.println(sum);
		}
		static void Division()
		{ 
			 Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			int a=s1.nextInt();
			System.out.println("Enter the value of b:");
			int b=s1.nextInt();
			System.out.println("Division:");
			int sum=a%b;
			System.out.println(sum);
		}
		public static void main(String[] args) {
			Scanner6 a1=new Scanner6();
			a1.Add();
			a1.Subtract();
			a1.Multiply();
			a1.Division();
			

	

	}

}
