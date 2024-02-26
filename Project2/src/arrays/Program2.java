package arrays;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args)
	{
		String name[]=new String[3];
		name[0]="Clerine";
		name[1]="Koili1";
		name[2]="Flevia2";
		//System.out.println( Arrays.toString(name));
		Arrays.sort(name);
		System.out.println( Arrays.toString(name));
		
		int rollno[]=new int[3]	;
		rollno[0]=78;
		rollno[1]=99;
		rollno[2]=67;
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
		
		
		
		

	}

}
