package abstractmethod;
interface Amazon
{void login();
	void logout();
	}
public class Practice_Interface implements Amazon{
public static void main(String[] args) 
	{
		Practice_Interface a1=new Practice_Interface();
		a1.login();
		a1.logout();
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
