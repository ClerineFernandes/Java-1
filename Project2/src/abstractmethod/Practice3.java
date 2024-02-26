package abstractmethod;
interface country
{
	void Bangalore();
}
abstract class state implements country 
{
	abstract void karnataka();
	void mangalore()
	{
		System.out.println("Beautiful city");
	}
}
public class Practice3 extends state
{
public static void main(String[] args){
		Practice3 p1=new Practice3();
		p1.Bangalore();
		p1.karnataka();
		p1.mangalore();
		}
public void Bangalore() 
{
		System.out.println("Coolest City");
	}
void karnataka() 
	{
		System.out.println("Beautiful State");
		}

}
