package OOPS;
class Animal
{
	public void display() {
		System.out.println("Parent class Animal method");
	}
}
class Dog extends Animal{
	public void DogDisplay()
	{
		System.out.println("Dog class Animal method");
	}
}
class Cat extends Animal{
	public void displayCat() {
		System.out.println("Cat class Animal method");
	}
	
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		
Dog d=new Dog();
d.DogDisplay();
d.display();
Cat c=new Cat();
c.displayCat();
c.display();
}

}
