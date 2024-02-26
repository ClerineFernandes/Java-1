package methodOverrding;
abstract class AbstractClass1
{
	abstract void login();
	abstract void otp();
}
abstract class AbstractClass2 extends AbstractClass1
{
	abstract void logout();
}

public class ConcreteClass extends AbstractClass2 
{

	public static void main(String[] args) {
		ConcreteClass c1=new ConcreteClass();
		c1.logout() ;
		c1.login();
		c1.otp();

	}

	
	void logout() 
	{
		System.out.println("Logout");
		
	}


	
	void login() 
	{
		
		System.out.println("Login");
	}


	
	void otp()
	{
		System.out.println("OTOP");
		
	}

}
