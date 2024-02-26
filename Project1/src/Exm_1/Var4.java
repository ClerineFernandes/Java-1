package Exm_1;

import java.util.Arrays;

public class Var4 {

	public static void main(String[] args)
	{
		String name="clerine123";
		System.out.println(name.repeat(5));
		String name1="I love my country";
		System.out.println(name.replaceAll("c", ""));
		System.out.println(name.replaceAll("c", "C"));
		System.out.println(name1.replaceAll(" ", ""));
		System.out.println(name.replaceAll("[a-z]", ""));
		System.out.println(name.replaceAll("", ""));
		String a1="My Name IS Manish";
		System.out.println(a1.replaceAll("[a-z]", ""));
		String s1="My name is Clerine";
		String s2[]=s1.split(" ");
		System.out.println(Arrays.toString(s2));
		
		
		
		
	}

}
