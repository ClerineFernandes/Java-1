package example1;

public class AdditionConstructor 
{
	AdditionConstructor()
	{this(10,20);
		System.out.println("Fernandes");
	}
	AdditionConstructor(int a,int b)
	{this(1.0,20);
		System.out.println("Hello1");
	}
	AdditionConstructor(double a,int b)
	{this("Clerine 	");
		System.out.println("Hello2");
	}
	AdditionConstructor(String a)
	{
		System.out.println("Hello3");
	}

	public static void main(String[] args)
	{
		AdditionConstructor a1=new AdditionConstructor();
	

	}

}
