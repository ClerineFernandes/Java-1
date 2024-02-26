package abstractmethod;
abstract class one
{
	abstract void Login();
	abstract void OTP();
	
}
abstract class two extends one
{
	abstract void Logout();
}

public class Abstract3 extends  two
{

	public static void main(String[] args) 
	{
		Abstract3 a3=new Abstract3();
		a3.Login();
		a3.Logout();
		a3.OTP();

	}

	
	void Logout() 
	{
		System.out.println("Logout");
	}

	
	void Login()
	{
		System.out.println("Login");
		
	}

	
	void OTP() 
	{
		System.out.println("OTP");
	}

}
