package inheritance5;
 class Parent
{
	static void add()
	{
		System.out.println("Addition");
	}
}
 class Daughter1 extends Parent
{
	static void subtract()
	{
		System.out.println("Subtraction");
	}
}

public class Son extends Parent
{
	static void Multiply()
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] args) {
		add();
		
		 Multiply();
		
		
		
	}

}
