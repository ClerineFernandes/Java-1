package Exm_1;

import java.util.Scanner;

public class Scann2 
{
	static double pi=3.14;

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius");
		Double r=s1.nextDouble();
		System.out.println("Circumference of circle");
		Double circle=2*pi*r;
		System.out.println(circle);
		
	}

}
