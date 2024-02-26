package inheritance6;
class Parent
{

	static void add()
	{
		System.out.println("Addition");
	}
}
 class Daughter extends Parent
{
	 void subtract()
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
		Daughter d1=new Daughter();
		d1.subtract();
		

		
		
	}

}
