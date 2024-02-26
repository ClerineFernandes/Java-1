package arrays;

import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) 
	{
	   int num[]=new int[4];
	  num[0]=9;
	  num[1]=3;
	  num[2]=4;
	  num[3]=2;
	  //double average=(num[0]+num[1]+num[2]+num[3])/num.length;
	 // System.out.println( average);
	  int sum=0;
	  for(int i=0;i<num.length;i++)
	  {
		  sum=sum+num[i];
	  }
	  System.out.println(sum);
	  double average=sum/num.length;
	  System.out.println(average);
	  double reminder=sum%num.length;
	  System.out.println(reminder);
	  
	   
	  
	   
	   
		  

	   
			  
	   
			   

	}

}
