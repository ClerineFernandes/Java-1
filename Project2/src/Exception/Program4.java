package Exception;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		if(age>18)
		{
			System.out.println("Access google");
		}
		else
		{
			throw new ArithmeticException("You are a kid");
		}
		

	}

}
