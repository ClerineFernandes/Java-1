package polymorphism_Encapsulation;
class Amazon
{
	private String Username="clerine@gmail.com";
	
public String get_Username() 
{
		return Username;
	}

	public void set_Username(String Username) 
	{
		this.Username = Username;
	}

public class Encapsulation1
{

	public static void main(String[] args) 
	{
		Amazon a1=new Amazon();
		a1.set_Username("fernandes@gmail.com");
		System.out.println(a1.get_Username());

	}

}
}