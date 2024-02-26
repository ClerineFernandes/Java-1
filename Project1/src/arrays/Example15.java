//Sort an array
package arrays;

import java.util.Arrays;

public class Example15 {

	public static void main(String[] args) {
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="Sham";
		name[2]="Aanam";
		
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
	
		int rollno[]=new int[3];
		rollno[0]=72;
		rollno[1]=23;
		rollno[2]=87;
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
		
	}

}
