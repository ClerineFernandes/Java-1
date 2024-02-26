package Exm_1;

public class pali {

	public static void main(String[] args) {
		String input="MOM";
		String Output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse=input.charAt(i);
			Output=Output+reverse;
		}
		System.out.println(Output);
		if(input.equals(Output))
		{
			System.out.println("Its a palindorme");
		}
		else
		{
			System.out.println("Its not a palindorme ");
		}

	}

}
