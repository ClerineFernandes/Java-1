package stringFunction;

public class String17 
{

	public static void main(String[] args)
	{
		String name="Clerine15";
		char c1[]=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			
		boolean answer=Character.isDigit(c1[i]);
		if(answer==true)
		{
			System.out.println(c1[i]+" "+"It is a digit:"+answer);
		}
		else
		{
		System.out.println(c1[i]+" "+"It is a character:"+answer);
		}
		

	}
}
}


