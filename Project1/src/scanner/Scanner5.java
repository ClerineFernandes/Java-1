package scanner;

import java.util.Scanner;

public class Scanner5 {
	
	    static int a;
	    static int b;

	    public static void operation() {
	        int addition = a + b;
	        int subtraction = a - b;
	        int multiplication = a * b;
	        int division = a % b;

	        System.out.println("Addition: ");
	        System.out.println(addition);
	        System.out.println("Subtraction: ");
	        System.out.println(subtraction);
	        System.out.println("Multiplication: " );
	        System.out.println(multiplication);
	        System.out.println("Division: " );
	        System.out.println(division);
	    }

	    public static void main(String[] args) {
	        Scanner s1 = new Scanner(System.in);

	        System.out.print("Enter value for a: ");
	        a = s1.nextInt();

	        System.out.print("Enter value for b: ");
	        b = s1.nextInt();
	        operation();
	    }
}

	    
	
		
		
		




