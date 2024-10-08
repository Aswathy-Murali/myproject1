package OOPS;
class Member
{
	String name,address;
	int age,salary,phonenumber;
	public void printdetails()
	{
		System.out.println("Name ="+ name);
		System.out.println("Age ="+ age);
		System.out.println("Salary ="+ salary);
		System.out.println("Address ="+ address);
		System.out.println("Phone number ="+ phonenumber);
		
		}
}
class Employee extends Member
{
	String specialization;
	public void displayEmployee()
	{
		System.out.println("Specialization="+ specialization);	
	}
}
class Manager extends Member
{
	String department;
	public void displayManager()
	{
		System.out.println("Department="+ department);	
	}
}
public class MemberInheritance {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Aswathy";
		e.age=29;
		e.address="daxsfca gsvdg";
		e.salary=23400;
		e.phonenumber=1213242454;
		e.specialization="Testing";
		e.printdetails();
		e.displayEmployee();
		
		Manager m=new Manager();
		m.name="Murali";
		m.age=39;
		m.address="aann gghh";
		m.salary=83400;
		m.phonenumber=88888888;
		m.department="HR";
		m.printdetails();
		m.displayManager();
		
		
	}

}
