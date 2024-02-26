package abstractmethod;
abstract class API
{
	abstract void login();
	abstract void Auth();
	abstract void twowayAuth();
	
}

public class Abstract2 extends API
{

	public static void main(String[] args) 
	{
		Abstract2 a1=new Abstract2();
		a1.login();
		a1.twowayAuth();
		a1.Auth();
		
	}


	void login()
	{
		System.out.println("Login1");
		
	}

	
	void Auth() 
	{
		System.out.println("Auth1");
		
	}

	
	void twowayAuth()
	{
		System.out.println("TwoWayAuth");
		
	}

}
