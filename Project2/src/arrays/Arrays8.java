package arrays;

import java.util.Arrays;

public class Arrays8 {

	public static void main(String[] args)
	{
		int rollno[]=new int[4];
		 rollno[0]=19;
		 rollno[1]=1;
		 rollno[2]=9;
		 rollno[3]=29;
		 int rollno1[]=new int[4];
		 for(int i=0;i<4;i++)
		 {
			 rollno1[i]=rollno[i];
		 }
		 System.out.println("Copied Array is:"+Arrays.toString(rollno1));
		 Arrays.sort(rollno1);
		 System.out.println("Sorted Array is:"+Arrays.toString(rollno1));
		 
		 
		 
		
		
	}

}
