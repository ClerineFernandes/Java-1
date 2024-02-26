package packageone;

public class StaticMethod {
	static void add()
	{
		System.out.println("1");
		System.out.println("2");
	}

	public static void main(String[] args) {
		{
			System.out.println("3");
			System.out.println("4");
			add();
			
		}
		
	}

}
