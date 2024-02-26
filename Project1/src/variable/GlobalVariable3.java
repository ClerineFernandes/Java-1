package variable;

public class GlobalVariable3 {
	static int a;
	static int b;

	static void add()
	{ 
	a=100;
	b=300;
	int sum=a+b;
	System.out.println(sum);
	}
	static void subtract()
	{
		a=900;
		b=800;	
		int sum=a-b;
		System.out.println(sum);

	
	}
	public static void main(String[] args) {
		
	add();
	subtract();
	

	}

}
