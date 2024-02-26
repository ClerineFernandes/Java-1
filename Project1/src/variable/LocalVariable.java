package variable;

public class LocalVariable {
	
		static void add(int a,int b)
		{
			System.out.println("Hi");
		}
	
	void add()
	{
		System.out.println("Clerine");
	}
	public static void main(String[] args) {
	
		int a=100;
		int b=900;
		int sum=a+b;
		System.out.println(sum);
		LocalVariable L1=new LocalVariable();
		L1.add();
		LocalVariable.add(10,20);
		
	}

}
