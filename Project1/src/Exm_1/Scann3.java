package Exm_1;

import java.util.Scanner;

public class Scann3 {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius");
		Double r=s1.nextDouble();
		System.out.println("Area of circle");
		Double circle=0.5*r*r;
		System.out.println(circle);
		

	}

}
