package example1;

public class StringFunction {

	public static void main(String[] args) {
		String input="clerine";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse=input.charAt(i);
			output=output+reverse;
			
			
		}
		System.out.print(output);
	}

	
}
