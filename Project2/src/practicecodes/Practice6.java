package practicecodes;
class ones
{
	 ones()
	{
		System.out.println("Hello");
	}
}
class twos extends ones
{
	twos()
	{
		System.out.println("Hi");
		
	}
}

public class Practice6 extends twos
{
	Practice6()
	{
		System.out.println("Hola");
		
	}

	public static void main(String[] args) 
	{
		new Practice6();

	}

}
