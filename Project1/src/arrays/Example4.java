package arrays;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args)
	{
		String name[]=new String[3];
		name[0]="Blue";
		name[1]="Yellow";
		name[2]="Green";
	
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		int rollno[]=new int[3];
		rollno[0]=51;
		rollno[1]=23;
		rollno[2]=14;
		
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
		
		
		

	}

}
