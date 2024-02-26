package variable;

public class LocalVariable2 {
	void add()
	{
		int a=100;
		System.out.println(a);
	}

	public static void main(String[] args) {
		{
			LocalVariable2 L1=new LocalVariable2 ();
			L1.add();
		}

	}

	
}
