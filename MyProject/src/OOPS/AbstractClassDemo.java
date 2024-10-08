package OOPS;


	abstract class Vehicle{
		abstract public void VehicleDetails();
	public void Owners()
	{
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		}
	}
	
class Toyoto extends Vehicle
{
	@Override
	public void VehicleDetails()
	{
		System.out.println("Name: "+"Toyoto");
		System.out.println("Color:"+"Black");
		System.out.println("Model: "+"2000");
	}
}

class Maruthi extends Vehicle
{
	@Override
	public void VehicleDetails()
	{
		System.out.println("Name: "+"Maruthi");
		System.out.println("Color:"+"Red");
		System.out.println("Model: "+"2020");
	}
}
public class AbstractClassDemo {
	public static void main(String[] args) {
	
		Maruthi m=new Maruthi();
		m.VehicleDetails();
		m.Owners();
		
		Toyoto t=new Toyoto();
		t.Owners();
		t.VehicleDetails();
		
	}

}
