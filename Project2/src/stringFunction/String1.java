package stringFunction;

public class String1 
{

	public static void main(String[] args) 
	{
		String name="ClerineFernandes";
		String name1="Fernandes   ";
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name1.trim());
		System.out.println(name.concat(" ").concat(name1));
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf('e'));
		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 6));
		System.out.println(name.contains("e"));
		System.out.println(name.matches("Clerine"));
		System.out.println(name.isEmpty());
		System.out.println(name.endsWith("k"));
		
		
		
		
		

	}

}
