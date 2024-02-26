package stringFunction;

public class String19 {

	public static void main(String[] args) 
	{
		String name="Rahul123";
		char c1[]=name.toCharArray();
		int charCount = 0;
        int digitCount = 0;
		for (int i = 0; i < name.length(); i++) 
		{
            if (Character.isDigit(c1[i])) 
            {
               System.out.println(digitCount++); 
            } 
            else
            	{
            	System.out.println( charCount++);
            	} 
		}
                
		

	}

}
