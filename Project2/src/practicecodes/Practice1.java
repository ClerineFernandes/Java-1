package practicecodes;

interface one {
    void add();
    void subtract();
}

interface two {
    void multiply();
    void divide();
}
interface three {
    void first();
    void second();
}
interface four {
    void third();
    void fourth();
}
public class Practice1 implements one, two ,three, four {

    public static void main(String[] args) {
    	Practice1 a1 = new Practice1();
        a1.add();
        a1.divide();
        a1.multiply();
        a1.subtract();  
        a1.first();
        a1.fourth();
        a1.second();
        a1.third();
        }
public void add() {
        System.out.println("Addition");
    }
public void subtract() {
        System.out.println("Subtraction");
    }

    public void multiply() {
        System.out.println("Multiplication");
    }

    public void divide() {
        System.out.println("1");
    }

	
	public void third() {
		System.out.println("2");
		
	}
public void fourth() {
		
		System.out.println("3");
	}

	public void first() {
		
		System.out.println("4");
	}
public void second() {
		
		System.out.println("5");}
}
