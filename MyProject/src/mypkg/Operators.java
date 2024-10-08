package mypkg;

public class Operators {

	public static void main(String[] args) {
	System.out.println("----------Arithmetic Operators---------");
	int a=30,b=4;
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	System.out.println("a%b="+(a%b));
	
	System.out.println("----------Relational Operators---------");
	int x=40,y=5;
System.out.println("if x> y "+(x>y));
System.out.println("if x< y "+(x<y));
System.out.println("if x= y "+(x==y));
System.out.println("if x!= y "+(x!=y));
	
System.out.println("----------Assignment Operators---------");
int p=30,q=4;
System.out.println("= operator "+(p=q));//p=4 q=4
System.out.println("+= operator "+(p+=q));//p=8 q=4
System.out.println("-= operator "+(p-=q));//p=4 q=4
System.out.println("*= operator "+(p*=q));//p=16 q=4
System.out.println("/= operator "+(p/=q));//p=4 q=4
System.out.println("%= operator "+(p%=q));//p=0 q=4
 

System.out.println("----------Conditional Operators---------");
int a1=3,a2=5;
String s=(a1>a2?("a1 greater than a2"):("a2 greater than a1"));
System.out.println(s);


System.out.println("----------Unary Operators---------");
int u=4;
System.out.println(u++);//4
System.out.println(++u);//6
System.out.println(u);//6
System.out.println(u++);//6
System.out.println(u);//7
System.out.println(u--);//7
System.out.println(--u);//5


System.out.println("----------Logical Operators---------");
String username="aswathy" ;
String password="123";
System.out.println((username=="aswathy") && (password=="123"));
System.out.println((username=="aswathy") || (password=="123"));
System.out.println(!(username== "aswathy"));
System.out.println(!(password=="123"));

	}
}