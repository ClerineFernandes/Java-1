package methodOverrding;
abstract class Api//abstract class
{
	abstract void login();
	abstract void auth();
	abstract void twowayauth();
}

public class Abstract1 extends Api
{

	public static void main(String[] args) {
		Abstract1 a1=new Abstract1();
		a1.login();
		a1.auth();
		a1.twowayauth();

	}

	
	void login()
	{
		System.out.println("Login");
		
	}

	
	void auth() 
	{
		
		System.out.println("Authetication");
	}

	
	


	
	void twowayauth() {
		
		System.out.println("TwoWayAuth");
	}
		
	}


