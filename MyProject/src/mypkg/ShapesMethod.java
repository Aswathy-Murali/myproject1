package mypkg;
import java.util.Scanner;
public class ShapesMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ShapesMethod ob=new ShapesMethod();
		
		System.out.println("Enter breadth and length of rectangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ob.Rectangle(a,b);
		
		System.out.println("Enter breadth and height of triangle");
		int x=sc.nextInt();
		int y=sc.nextInt();		
		System.out.println("Area of Triangle="+ ob.Triangle(x,y));
		
		ob.Circle();
		System.out.println("Area of Square="+ ob.Square());
	}
	public void Rectangle(int a,int b)
	{
		System.out.println("Area of rectangle="+ (a*b));
	}
public double Triangle(int a,int b) {
	double c= 0.5*a*b;
	return c;
}
public void Circle()
{
	int r=6;
	System.out.println("Area of Circle="+ 3.14*r*r);
}
public int Square() {
	int a=10;
	return a*a;
}
}
