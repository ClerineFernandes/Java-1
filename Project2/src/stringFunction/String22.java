package stringFunction;

public class String22 {

	public static void main(String[] args) 
	{
		String input="MOM";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char Reverse=input.charAt(i);
			output=output+Reverse;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("The given String is a palindorme");
		}
		else
		{
			System.out.println("The given String is not a palindorme");
		}
	
		
	}

}
