package interface1;
interface Amazon
{
	void login();
	void logout();
}

public class Project1 implements Amazon
{
	public static void main(String[] args) 
	{
		Project1 p1=new Project1();
		p1.login();
		p1.logout();
		
	}

	
	public void login() 
	{
	System.out.println("Login");
		
	}


	public void logout()
	{
		
		System.out.println("Logout");
	}

}
