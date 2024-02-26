package scanner;

import java.util.Scanner;

public class Scanner6 
{
	static void AreaOfTriange()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of base:");
		int b = s1.nextInt();
		System.out.println("Enter the value of height:");
		int h=s1.nextInt();
		System.out.println("AreaOfTriange:");
		System.out.println(0.5*b*h);
	}

	public static void main(String[] args) 
	{
		AreaOfTriange();
		

	}

}
