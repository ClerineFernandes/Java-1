package constructor;

public class MethodOverloading2 {
	void add(int a)
	{

	System.out.println("print1");
	}

   void add(int a, int b)
   {
   System.out.println("print2");
   }

	public static void main(String[] args) {
		MethodOverloading2 a1=new MethodOverloading2();
		a1.add(10);
		a1.add(10,20);
		
		
	}

}

