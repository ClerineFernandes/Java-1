package typecasting;
class new1{
	void One()
	{
		System.out.println("1");
	}}
class new2 extends new1{
	void Two()
	{
		System.out.println("2");
	}}
class new3 extends new2{
	void Three()
	{
		System.out.println("3");
	}}
public class TypeCasting5 extends new3{
		void Four()
		{
			System.out.println("4");
		}
	public static void main(String[] args) {
		new2 n1=new new3();
		n1.One();
		n1.Two();
		new3 n2=new TypeCasting5 ();
		TypeCasting5 n3=(TypeCasting5)n2;
		n3.Three();
		n3.Four();
		}}
