package example1;

public class BlocksInJava
{
	BlocksInJava()
	{
		System.out.println("Im Constructor");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args)
	
	{
		
		System.out.println("Main Method");
		new BlocksInJava();
	}
	static
	{
		System.out.println("This Is SIB 3");
	}
	

}
