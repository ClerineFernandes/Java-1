package arrays;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=98;
		rollno[1]=65;
		rollno[2]=75;
		rollno[3]=85;
		int rn1[]=new int[4];
		for(int i=0;i<4;i++)
		{
			rn1[i]=rollno[i];
		}
		System.out.println("Copied array is:"+Arrays.toString(rollno));
			System.out.println(Arrays.toString(rn1));
			
			
		}
		
		
		
		
		

	}


