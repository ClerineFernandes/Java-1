package stringFunction;

import java.util.Arrays;

public class String23 {

	public static void main(String[] args)
	{
		String a1="animal";
		String a2="malina";
		if(a1.length()!=a2.length())
		{
			System.out.println("Not an Aanagram");
		}
		else
		{
			char[] c1=a1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char[] c2=a2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2)==true);
			{
				System.out.println( "It's an Aanagram");
			}
			
			
			
		}
		

	}

}
