package this_calling;

public class hello1
{
	hello1(String a)
	{
		System.out.println("Hi");
		
	}
	hello1(int a)
	{
		this("cleine");
		System.out.println(a+6);
		
	}

	public static void main(String[] args) 
	{
		new hello1(16);

	}

}
