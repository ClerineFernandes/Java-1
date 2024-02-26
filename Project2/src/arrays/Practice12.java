package arrays;
class One
{
	static void add() 
	{
		System.out.println("Addition");
	}
	 void subtract() 
	{
		System.out.println("Substraction");
	}
	}
abstract class Two extends One
{
	abstract void multiply();
	abstract void division();
}
public class Practice12 extends Two
{
	static void start()
	{
		System.out.println("Starting");
	}
	static void end()
	{
		System.out.println("Ending");
	}

	public static void main(String[] args) 
	{
		Practice12 a4=new Practice12();
		a4.division();
		a4.multiply();
		a4.subtract();
		add() ;
		start();
		end();
	
		
	}
	
	void multiply() 
	{
		System.out.println("Multiplication");
		
	}
	
	void division() 
	{
		System.out.println("Division");
		
	}

}


