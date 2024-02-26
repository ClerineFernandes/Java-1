
public class palindrome {

	public static void main(String[] args) {
		String input="Clerine";
		String Output="";
		for(int i=input.length()-1;i>=0;i--)
		{
		char reverse=	input.charAt(i);
		Output=Output+reverse;
		}
		System.out.println(Output);
		if(input.equals(Output))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Its not a Palindrome");
		}
	}

}
