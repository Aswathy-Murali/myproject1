package mypkg;
import java.util.Scanner;
import OOPS.AccessMOdifiers;
public class AmstrongScanner  extends AccessMOdifiers{

	public static void main(String[] args) {
		int a,b;
		char c;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter number 1 ");
			a=sc.nextInt();
			System.out.println("Enter number 2 ");
			b=sc.nextInt();
			System.out.println("Result =" + (a+b));
		
		
		System.out.println("Do u want to continue? y or n");
		c=sc.next().charAt(0);
		}while(c=='y');
	
		
		
		
		AmstrongScanner am=new AmstrongScanner();
		System.out.println(am.c+am.d); // public and protected only
	}

}
