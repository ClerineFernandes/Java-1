package constructor;

public class NonStatic {
	void add()
	{
	int a=200;
	int b=900;
	int sum=a+b;
	System.out.println(sum);
	}
	void subtract()
	{
	int a=600;
	int b=200;
	int sum=a-b;
	System.out.println(sum);
	}
	public static void main(String[] args) {
		NonStatic n1=new NonStatic();
		n1.add();
		n1.subtract();
		
		
	}


}
