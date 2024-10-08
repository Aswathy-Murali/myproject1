package OOPS;
class Monkey 
{
	public void bite()
	{
		System.out.println("Bite");
	}
	public  void Jump()
	{
		System.out.println("Jump");
	}
}
interface BasicAnimal{
	public void Eat();
	public void Sleep();
}
class Human extends Monkey implements BasicAnimal
{
	public void Speak()
	{
		System.out.println("Speak");
	}
	public void Eat()
	{
		System.out.println("Eat");
	}
	public void Sleep()
	{
		System.out.println("Sleep");
	}
}
public class IntefacePgm2 {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.bite();
		obj.Jump();
		obj.Eat();
		obj.Sleep();
		obj.Speak();

	}

}
