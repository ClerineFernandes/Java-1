package stringFunction;

public class String24 {

	public static void main(String[] args) 
	{
		String a="clerine";
		String b="I love my India";
		boolean a1=a.matches(".......");
		System.out.println(a1);
		boolean a2=a.matches("c.....");
		System.out.println(a2);
		boolean a3=a.matches("c(.*)");
		System.out.println(a3);
		boolean a4=b.matches("(.*)love(.*)");
		System.out.println(a4);

	}

}
