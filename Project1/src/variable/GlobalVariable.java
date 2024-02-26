package variable;

public class GlobalVariable {
	
	static int a=10;
	static void add()
	{
		a=100;
		int area=a*6;
		System.out.println(area);
	}

	public static void main(String[] args) {
		add();
		

	}

}
