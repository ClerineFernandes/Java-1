package typecasting;
class Upcastings3{
	void upcast3()
	{
		System.out.println("3");
	}
}
class Upcastings2 extends Upcastings3{
	void upcast2()
	{

		System.out.println("2");
	}
	}
public class TestCase2 extends Upcastings2{
	void upcast1()
	{
		System.out.println("1");
	}
	public static void main(String[] args)
	{
		Upcastings3 u1=new TestCase2 ();
		u1.upcast3();
		TestCase2 t1=(TestCase2)u1;
		t1.upcast1();
		t1.upcast2();
		
		

	}

}
