package mypkg;
import java.util.Scanner;
public class PaliScanner {

	public static void main(String[] args) {
		int n,d,a,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextInt();
		a=n;
		do
		{
			d=n%10;
			r=(r*10)+d;
			n=n/10;
		}while(n>0);
		if(r==a)
		{
			System.out.println("Number is paliandrome");
			
		}
		else
			
		System.out.println("Not paliandrome");
	}

}
