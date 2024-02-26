package conditonStatement;

public class Gender {

	public static void main(String[] args) {
		int salary=6789899;
		char gender='M';
				if(salary<=5000)
				{
					if(gender=='M')
					{
						System.out.println("Logic1");
					}
					else
					{
						System.out.println("Logic2");
					}
				}
				else
				{
					System.out.println("Logic3");
				}
	}

}
