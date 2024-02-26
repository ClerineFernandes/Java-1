package variable;

public class AreaOfCircle {
  
public void calculateArea(int r)
{
    final double PI = 3.14159; 
    double area = PI * r * r;
    System.out.println( area);
}

public static void main(String[] args) {
	AreaOfCircle circle = new AreaOfCircle();
    circle.calculateArea(7); 
    circle.calculateArea(14); 
}
}