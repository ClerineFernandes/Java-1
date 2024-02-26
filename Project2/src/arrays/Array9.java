package arrays;import java.util.Arrays;
import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		
		int num[]=new int[4];
		num[0]=90;
		num[1]=43;
		num[2]=17;
		num[3]=12;
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
