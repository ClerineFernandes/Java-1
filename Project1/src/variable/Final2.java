package variable;

public class Final2{
    
    static final double PI = 3.14159;
    
    static void calculateArea(int radius) {
        double area = PI * radius * radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        calculateArea(7); 
        calculateArea(14); 
    }

    
   
    }
