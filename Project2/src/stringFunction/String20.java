package stringFunction;

public class String20 {

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
		
	}

}
