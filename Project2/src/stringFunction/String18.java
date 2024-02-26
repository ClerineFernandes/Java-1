package stringFunction;

public class String18 {

	public static void main(String[] args) 
	{
		String name="Clerine123";
				char c1[]=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if(answer==true)
			{
				System.out.println(i);
			}
		}
		

	}

}
