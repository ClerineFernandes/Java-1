package blocksInJava;

public class ConstructorIIB {
	
	ConstructorIIB(int a, int b)
	{
		System.out.println("Im Constructor");
	}
	ConstructorIIB(int a)
	{
		System.out.println("Im Constructor");
	}
	ConstructorIIB(int a, double b )
	{
		System.out.println("Im Constructor");
	}
	ConstructorIIB()
	{
		System.out.println("Im Constructor");
	}

{
	System.out.println("Im IIB4");
}


public static void main(String[] args) {
	new ConstructorIIB(10,20);
	new ConstructorIIB(10);
	new ConstructorIIB(10,2.0);
	new ConstructorIIB();
}		

}
