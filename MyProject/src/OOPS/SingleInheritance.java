package OOPS;

public class SingleInheritance {

	public static void main(String[] args) {
		
B b=new B();
b.a=800;
b.display2();
}

}

class A{
	int a;
	public void display()
	{
		System.out.println("Parent class");
	}
	
}
class B extends A{
	public void display2()
	{
		display();
		a=900;
		System.out.println("Child class");
		System.out.println("a="+a);
		
	}
}
