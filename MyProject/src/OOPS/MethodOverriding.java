package OOPS;
class A1
{
	public void Display()
	{
		System.out.println("ClasA A="+ "A");
	}
	public void Input()
	{
		String name="Parent Class";
		System.out.println(name);
	}
}
class B1 extends A1
{

	@Override
	public void Display() {
		System.out.println("Class B="+ "B");
		super.Display();
	}
	@Override
	public void Input()
	{
		String name="Child Class";
		System.out.println(name);
		super.Input();
	}
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		B1 m=new B1();
		m.Display();
		m.Input();

	}

}
