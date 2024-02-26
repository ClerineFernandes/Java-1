package stringFunction;

public class String9 {

	public static void main(String[] args) 
	{
		String name="clerine12345";
		String name1="I love my country";
		String name3="My Name Is Clerine";
		System.out.println(name.replaceAll("C", ""));
		System.out.println(name.replaceAll("e", "E"));
		System.out.println(name1.replaceAll(" ", "   "));
		System.out.println(name.replaceAll("[a-z]",""));
		String name4=name3.replaceAll(" ", "");
		System.out.println(name4);
		//String name4=name3.replaceAll("[a-z]", "");
		
		
		
		

	}

}
