package OOPS;
interface Bike{
	 public void display();
}
class Ar implements Bike
{
	public void display()
	{
		System.out.println("Details Ar");
	}
}
class Br implements Bike
{
	public void display()
	{
		System.out.println("Details Br");
	}
}
public class InterfaceBasic {

	public static void main(String[] args) {
		Ar a=new Ar();
		a.display();
		Br b=new Br();
		b.display();

	}

}
