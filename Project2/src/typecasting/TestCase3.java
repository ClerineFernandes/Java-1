package typecasting;
class Logic1{
	void Teacher()
	{
		System.out.println("A");
	}}
class Logic2 extends Logic1
{
	void Student()
	{
		System.out.println("B");
	}}
public class TestCase3 extends Logic2
{
	void Master()
	{
		System.out.println("C");
	}
public static void main(String[] args) 
	{
		Logic2 a1=new TestCase3();
		a1.Student();
		TestCase3 t3=(TestCase3)a1;
		t3.Master();
		t3.Teacher();
}
}
