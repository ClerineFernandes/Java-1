package interface1;
interface logic2
{
	void login1();
	void auth();
}
interface logic1 extends logic2
{
	void logout();
	void signin();
 	
}

public class Interface implements logic1
{

	public static void main(String[] args) {
		Interface I1=new Interface();
		I1.login1();
		I1.auth();
		I1.logout();
		I1.signin();
		
		

	}

	
	public void login1() 
	{
		System.out.println("Login1");
		
	}

	
	public void auth() 
	{
		System.out.println("Authetication");
		
		
	}

	
	public void logout()
	{
		
		System.out.println("Logout");
		
	}

	
	public void signin()
	{
		System.out.println("SignIn");
		
		
	}

}
