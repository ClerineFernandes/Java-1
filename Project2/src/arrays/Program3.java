package arrays;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args)
	{
		int rollno[]=new int[4];
		rollno[0]=233;
		rollno[1]=933;
		rollno[2]=243;
		rollno[3]=232;
		int rn[]=new int[4];
		for(int i=0;i<4;i++)
		{
			rn[i]=rollno[i];
		}
		System.out.println(Arrays.toString(rn));
		Arrays.sort(rn);
		System.out.println(Arrays.toString(rn));
		
		
		
		
	}

}
