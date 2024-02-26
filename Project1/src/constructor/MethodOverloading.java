package constructor;

public class MethodOverloading {
	static void add(int a)
	{
		System.out.println("Print1");
	}
	static void add(double a)
	{
		System.out.println("Print2");
		
	}
	void add(int a,int b)
	{
		System.out.println("Print3");
		
	}
	void add(boolean a)
	{
		System.out.println("Print4");
		
	}
	void add(String a)
	{
		System.out.println("Print5");
		
	}


	public static void main(String[] args) {
		
		
		MethodOverloading a1=new MethodOverloading();
		a1.add(10,20);
		a1.add(10,20);
		a1.add(false);
		a1.add("Clerine");
		
			

	}

}
