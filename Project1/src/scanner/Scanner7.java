package scanner;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
		
	        Scanner s1 = new Scanner(System.in);

	        System.out.print("Enter the value of base:");
	        double b = s1.nextDouble();

	        System.out.print("Enter the value of height: ");
	        double h = s1.nextDouble();

	        double area = 0.5 * b * h;
	        System.out.println("The area of the triangle is: " );
	        System.out.println(area);


	}

}
