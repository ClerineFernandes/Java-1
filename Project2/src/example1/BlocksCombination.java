package example1;

public class BlocksCombination
{
	
	static
	{
		System.out.println("SSB");
		
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	BlocksCombination()
	{
		System.out.println("Constructor");
	}
	
	

	public static void main(String[] args) 
	{
		
		System.out.println("Main Method");
		new BlocksCombination();
		

	}

}
