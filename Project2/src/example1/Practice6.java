package example1;

public class Practice6 
{
	Practice6()
	{
		System.out.println("This is a Constructor");
	}
	Practice6(int a)
	{
		System.out.println("Parametrized");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("1");
		Practice6 p1=new Practice6();
		new Practice6(10);
		
		
		
		

	}

}
