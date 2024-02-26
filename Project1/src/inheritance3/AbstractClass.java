package inheritance3;
abstract class Api//abstract class
{
	abstract void login();
	abstract void auth();
	abstract void twowayauth();
}//no implimentation

public class AbstractClass extends Api
{

	public static void main(String[] args)
	{
		AbstractClass a1=new AbstractClass();
		a1.auth();
		a1.login();
		a1.twowayauth();
	}


	void login() 
	{
		System.out.println("Logic of login");
		
	}


	void auth() {
		System.out.println("Logic of Auth");
		
	}

	
	void twowayauth() {
		
		System.out.println("Logic of Two way Auth");
	}

}
