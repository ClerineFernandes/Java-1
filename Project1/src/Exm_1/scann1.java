package Exm_1;

import java.util.Scanner;

public class scann1 {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of base:");
		Double b=s1.nextDouble();
		System.out.println("Enter the value of height");
		Double h=s1.nextDouble();
		Double area=0.5*b*h;
		System.out.println("The area of triangle is :");
		System.out.println(area);
		

	}

}
