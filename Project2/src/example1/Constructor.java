package example1;

public class Constructor 
{
	Constructor()
	{
		System.out.println("Hello World");
	}
	Constructor(int a)
	{
		System.out.println("Clerine");
	}
	

	public static void main(String[] args) 
	{
		Constructor c1=new Constructor ();
		new Constructor(20);
	}

}
