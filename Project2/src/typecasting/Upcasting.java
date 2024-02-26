package typecasting;
class Upcasting3{
	void upcast3()
	{
		System.out.println("3");
	}}
class Upcasting2 extends Upcasting3{
	void upcast2()
	{
		System.out.println("2");
	}
	}
class Upcasting1 extends Upcasting2{
	void upcast1()
	{
		System.out.println("1");
	}
	}
public class Upcasting extends TypeCasting5{
	void upcast()
	{
	System.out.println("4");
	}
public static void main(String[] args){
		Upcasting2 u1=new Upcasting1();
		u1.upcast2();
		u1.upcast3();
		Upcasting1 u2=(Upcasting1)u1;
		u2.upcast1();
}
}
