package constructor;

public class ParameterizedConstructor {

		ParameterizedConstructor (int a) 
		{
	        System.out.println("Inside FirstClass constructor");
	    }

		public void ParameterizedConstructor1(int i) {
			
			
		}
	}

	class SecondClass {
	    SecondClass(int a, int b) {
	        System.out.println();
	    }
	
	    public static void main(String[] args) 
	    {
	        ParameterizedConstructor f1= new ParameterizedConstructor(100);
	        f1.ParameterizedConstructor1 (100) ;
	    }
	}