package example1;

public class AddConstructor 
{
	 AddConstructor(int a)
	{
		System.out.println("Hello");
	}
      AddConstructor()
	{
		System.out.println("Hi");
	}

	public static void main(String[] args) 
	{
		AddConstructor a1=new AddConstructor();
		new AddConstructor (123);
		new AddConstructor(20);

	}

}
