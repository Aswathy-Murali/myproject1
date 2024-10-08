package mypkg;
import java.util.Scanner;
public class MethodPgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		
		MethodPgm ob=new MethodPgm();
		ob.add();
		System.out.println("Sub="+ ob.sub());
		ob.mul(a,b);
		System.out.println("Div="+ ob.div(a,b));
		}



//without retun and parameter
public void add()
{
	int a=35,b=89;
	System.out.println("Add="+ (a+b));
}

//with retun and without parameter
public int sub()
{
	int a=35,b=89;
	int c=a-b;
	return c;
}
//without retun and with parameter
public void mul(double a,double b)
{

	double c=a*b;
System.out.println("Mul="+ c);
}
public double div(double a,double b)
{

	double c=a/b;
	return c;
	
}
}