package OOPS;

public class MethodOverloading {

	public void Add()
	{
		int a=4,b=8,c;
		c=a+b;
		System.out.println(c);
	}
	public void Add(int a,float b)
	{
		float c=a+b;
		System.out.println(c);
	}
	public void Add(double a,float b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.Add();
		m.Add(7,3.4f);
		m.Add(4.55,4.2f);
		
	}

}
