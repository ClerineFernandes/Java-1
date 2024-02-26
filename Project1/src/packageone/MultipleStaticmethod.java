package packageone;

public class MultipleStaticmethod {
	static void Add()
	{
		System.out.println("Addition");
	}
	static void Subtract()
	{
		System.out.println("Subtraction");
	}
	static void Multiply()
	{
		System.out.println("Multiplication");
	}
	static void Divide()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) {
	
			System.out.println("Print");
			Divide();
			Add();
			Subtract();
			Multiply();
		}

	}


