package practicecodes;
interface dress
{
	void formals();
}

abstract class colour implements dress
{
	abstract void red();
	void shade()
	{
		System.out.println("Dark Red");
	}
	}
public class Practice2 extends colour
{
public static void main(String[] args) 
	{
		Practice2 a1=new Practice2();
		a1.formals();
		a1.red();
		a1.shade();
		}
void red() 
	{
		System.out.println("RED");
		
	}

	public void formals() 
	{
		System.out.println("Formals");
		}}
