package practicecodes;
interface reptiles
{
	void snake();
}
interface bird
{
	void sparrow();
}
interface animal
{
	void cat();
}
public class Practice4 implements animal, bird, reptiles
{
public static void main(String[] args) 
	{
		Practice4 p1=new Practice4();
		p1.cat();
		p1.snake();
		p1.sparrow();
}
public void snake() {
		System.out.println("Logic 1");
		}

public void sparrow() {
		System.out.println("Logic 2");
		}
public void cat() {
		System.out.println("Logic 3");
		}}
