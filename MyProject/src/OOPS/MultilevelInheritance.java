package OOPS;
class Parent{
	public void display() {
	System.out.println("Parent class Invoked");
	}
}
class Child1 extends Parent{
	public void displayChild1() {
		System.out.println("Child1 class Invoked");
		}
}
class Child2 extends Child1{
	public void displayChild2() {
		System.out.println("Child2 class Invoked");
		}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Child2 c=new Child2();
		c.display();
		c.displayChild1();
		c.displayChild2();
	}

}
