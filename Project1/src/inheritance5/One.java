package inheritance5;
class Three 
{
static void add()
{
	System.out.println("Addition using scanner class");
}
	

}

class Two extends Three
{
	static void substract()
	{
		System.out.println("Substraction using scanner class");
	}
}

public class One extends Two
{
	static void multiply()
	{
		System.out.println("Multiplication using scanner class");
	}
	public static void main(String[] args) 
	{
		multiply();
		substract();
		add();
	}

	
		

	}

