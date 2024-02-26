package example1;

public class StaticMethod 
{
	static void add()
	{
		System.out.println("1");
	}
	static void substract()
	{
		System.out.println("2");
	}
	static void multiply()
	{
		System.out.println("3");
	}
	static void divide()
	{
		System.out.println("4");
	}

	public static void main(String[] args) 
	{
		System.out.println("Starting");
		divide();
		
		 
		multiply();
		add();
		substract();
		
		

	}

}
