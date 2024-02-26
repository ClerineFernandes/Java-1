import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		
		switch(1)
		{
		case 1:System.out.println(a+b);
		case 2:System.out.println(a-b);
		case 3:System.out.println(a*b);
		case 4:System.out.println(a/b);
			
		}
		

	}

}
