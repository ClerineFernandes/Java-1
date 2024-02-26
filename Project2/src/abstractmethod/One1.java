package abstractmethod;

interface City {
    void ittax();
    void gettax();
}

interface First {
    void bangalore();
    void mangalore();
}
interface Second {
    void Kerala();
    void Wayanad();
}
interface Third {
    void Mumbai();
    void Pune();
}

public class One1 implements First, City ,Second , Third
{

    public static void main(String[] args) {
        One1 a1 = new One1();
        a1.bangalore();
        a1.gettax();
        a1.ittax();
        a1.mangalore();
        a1.Kerala();
        a1.mangalore();
        a1.Mumbai();
        a1.Pune();
    }

    public void ittax() {
        System.out.println("Logic1");
    }

    public void gettax() {
        System.out.println("Logic2");
    }

    public void bangalore() {
        System.out.println("Logic3");
    }

    public void mangalore() {
        System.out.println("Logic4");
    }

	
	public void Mumbai() {
		System.out.println("Logic5");
	}


	public void Pune() {
		System.out.println("Logic6");
	}

	
	public void Kerala() {
		System.out.println("Logic7");
	}

	
	public void Wayanad() {
		
		System.out.println("Logic8");
	}
}