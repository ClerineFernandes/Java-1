package example1;

public class addMethodOverloading 
{
	static void add(int a) 
	{
		System.out.println("1");
	}
	static void add(double a) 
	{
		System.out.println("2");
	}
	void add(char a) 
	{
		System.out.println("3");
	}
	void add(boolean a) 
	{
		System.out.println("4");
	}
	void add(String a) 
	{
		System.out.println("5");
		
	}
	public static void main(String[] args)
	{
		addMethodOverloading m1=new addMethodOverloading ();
		m1.add(false);
		m1.add('L');
		m1.add("Clerine");
		m1.add(2);
		
		m1.add(32.45);
		

	}

}
