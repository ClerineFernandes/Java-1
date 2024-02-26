package arrays;

public class Example18 {

	public static void main(String[] args) {
		String name="    ClERINE   ";
		System.out.println(name.toLowerCase());
		String name1="fernandes";
		System.out.println(name1.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.trim());
		System.out.println(name.concat("").concat(name1));
		System.out.println(name1.charAt(0));
		System.out.println(name1.charAt(2));
		System.out.println(name1.substring(2));
		String n="ClerineFernandes";
		System.out.println(n.substring(0, 7));
		System.out.println(n.contains("F"));
		System.out.println(n.matches("Clerine"));
		System.out.println(n.isEmpty());
		System.out.println(n.endsWith("s"));
	}
	

}
