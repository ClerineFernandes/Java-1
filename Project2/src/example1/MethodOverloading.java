package example1;

public class MethodOverloading 
{
	void add(int a)
	{
		System.out.println("Hello");
	}
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		
		MethodOverloading m1=new MethodOverloading ();
		m1.add(20);
		m1.add(80,78);
		

	}

}
