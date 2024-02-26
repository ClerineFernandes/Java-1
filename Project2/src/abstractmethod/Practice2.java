package abstractmethod;
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
public class Practice2 implements logic1
{
public static void main(String[] args)
	{
	Practice2 p1=new Practice2();
	p1.auth();
	p1.login1();
	p1.logout();
	p1.signin();

	}
public void login1()
	{
		System.out.println("Logic1");
	}
public void auth()
	{
		System.out.println("Authentication");
	}
public void logout()
	{

		System.out.println("Logout");
		}
public void signin() 
	{
		System.out.println("Signin");
		
	}

}
