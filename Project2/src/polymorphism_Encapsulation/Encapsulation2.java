package polymorphism_Encapsulation;
class Authentication
{
	private String Username="contact@gmail.com";
	public String get_Username()
	{
		return Username;
	}
	public void set_Username(String Username)
	{
		this.Username=Username;
	}
	private String Password="password12345";
	public String get_password()
	{
		return Password;
	}
	public void set_password(String Password)
	{
		this.Password=Password;
	}
	
}

public class Encapsulation2 
{

	public static void main(String[] args)
	{
		 Authentication a1=new  Authentication();
		 a1.set_Username("amol@gmail.com");
		 a1.set_password("amol@123");
		 System.out.println(a1.get_Username());
		 System.out.println(a1.get_password());

	}

}
