package Exm_1;

public class str3 {

	public static void main(String[] args) 
	{
		String input="DAD";
		String Output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse=input.charAt(i);
			Output=Output+reverse;
			
		}
		System.out.println(Output);
		if(input.equals(Output))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("Not a Palindorme");
		}

	}


}
