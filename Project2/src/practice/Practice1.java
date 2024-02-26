package practice;

public class Practice1 {

	public static void main(String[] args)
	{
		String name=" Good   bad  ";
		String name1="Clerine";
		String name2="Fernandes";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.trim());
		System.out.println(name1.concat(name2));
		System.out.println(name1.charAt(0));
		System.out.println(name1.indexOf('e'));
		System.out.println(name1.substring(2));
		System.out.println(name1.substring(2, 5));
		System.out.println(name1.contains("M"));
		System.out.println(name1.matches("Clerine"));
		System.out.println(name1.isEmpty());
		System.out.println(name1.endsWith("s"));
		
		

	}

}
