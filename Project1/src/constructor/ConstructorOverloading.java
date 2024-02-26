package constructor;

public class ConstructorOverloading {
	ConstructorOverloading(int a)
	{
		System.out.println("Print1");
	}
	ConstructorOverloading(int a,int b)
	{
		System.out.println("Print2");
	}

	public static void main(String[] args) {
		new ConstructorOverloading(10);
		new ConstructorOverloading(10,20);
		

	}

}
