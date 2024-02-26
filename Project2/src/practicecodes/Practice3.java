package practicecodes;
interface hola
{
	void h4();
}
interface hi extends hola
{
	void h3();
}
abstract class hello implements hi
{
	abstract void h1();
	abstract void h2();
}
public class Practice3 extends hello
{

	public static void main(String[] args) {
		Practice3 p1= new Practice3();
		p1.h1();
		p1.h2();
		p1.h3();
		p1.h4();}
public void h3() {
		
		System.out.println("Logic 1");
		}
void h1() {
		
		System.out.println("Logic 2");
		}

	void h2() {
		
		System.out.println("Logic 3");
	}

	public void h4() {
		
		System.out.println("Logic 4");
	}

}
