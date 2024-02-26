package stringFunction;

public class String11 {

	public static void main(String[] args) 
	{
		String name="GroTechMinds";
		System.out.println(name.repeat(2));
		String a=name.replaceAll("[a-z]", "");
		System.out.println("String a:"+a);
		String b=name.replaceAll("[A-Z]", "");
		System.out.println("String a:"+b);
		
		

	}

}
