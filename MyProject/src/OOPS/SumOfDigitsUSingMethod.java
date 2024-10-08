package OOPS;
import java.util.Scanner;
public class SumOfDigitsUSingMethod {
public int SumOfDigit(int n)
{ 
	int sum=0,d;
	while(n>0) {
		d=n%10;
		sum=sum+d;
		n=n/10;
		
	}
	return sum;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SumOfDigitsUSingMethod s=new SumOfDigitsUSingMethod();
		int n;
		System.out.println("Enter number");
	 n=sc.nextInt();
		System.out.println("Sum of digits= "+s.SumOfDigit(n));

	}

}
