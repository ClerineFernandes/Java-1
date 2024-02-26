//String Functions:
package arrays;

import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		String name[]=new String[3];
		name[0]="Clerine";
		name[1]="Fernandes";
		name[2]="Celine";
		System.out.println(Arrays.toString(name));
		
		String name2="Good";
		String lowercase=name2.toLowerCase();
		System.out.println(lowercase);
		System.out.println(name2.toUpperCase());
		System.out.println(name2.length());
		String name4="    My name is Clerine      ";
		System.out.println(name4.length());
		String name3="    My name is Clerine      ";
		System.out.println(name3.trim());
		String fname="Clerine";
		String lname="Fernandes";
		System.out.println(fname.concat(" ").concat(lname));
		
		
		

	}

}
