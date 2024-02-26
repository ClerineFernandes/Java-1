package inheritance1;
class Three
{
	static void add()
	{
		System.out.println("Addition using scanner class");
	}
}
class Two extends Three
{
	static void subtract()
	{
		System.out.println("Subtraction using scanner class");
	}
	
}

public class One extends Two
{
	static void multiplication()
	{
		System.out.println("Mubtraction using scanner class");
	}
public static void main(String[] args) {
	add();
	multiplication();
	subtract();
	
	
	
}
}
