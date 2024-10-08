package mypkg;
import java.util.Scanner;
public class CalculatorScanner {

	public static void main(String[] args) {
	int a,b,n;
	char ch;
Scanner sc=new Scanner(System.in);
System.out.println("---------------Calculator------------");
do {
	System.out.println("Enter number1 =");
	a=sc.nextInt();
	System.out.println("Enter number2 =");
	b=sc.nextInt();
	System.out.println("Enter choice (+,-,*,/,%) ");
	ch=sc.next().charAt(0);
	switch(ch)
	{
	case '+': System.out.println("result =" + (a+b));
	break;
	case '-': System.out.println("result =" + (a-b));
	break;
	case '*': System.out.println("result =" + (a*b));
	break;
	case '/': System.out.println("result =" + (a/b));
	break;
	case '%': System.out.println("result =" + (a%b));
	break;
	default: System.out.println("Wrong choice");

	}    
	System.out.println("Do you want to continue (0 or 1)?");
	n=sc.nextInt();
}while(n==1);  

	}

}
