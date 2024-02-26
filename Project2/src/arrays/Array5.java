package arrays;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		
		int age[]=new int[5];
		for(int i=0;i<5;i++)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of index"+i);
			
			age[i]=s1.nextInt();
		}

	}


}
