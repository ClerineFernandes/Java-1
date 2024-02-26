package stringFunction;

public class String21 {

	public static void main(String[] args)
	{
		
			String input="clerine";
			String Output="";
			for(int i=input.length()-1;i>=0;i--)
			{
				char Reverse=input.charAt(i);
				Output=Output+Reverse;
			}
			System.out.println(Output);
			
		if(input.equals(Output))
		{
			System.out.println("The given String is a Palindrome");
			
		}
		else
		{
			System.out.println("The given String is not a Palindrome");
		}

	}

}
