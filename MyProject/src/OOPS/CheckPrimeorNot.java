package OOPS;
import java.util.Scanner;
public class CheckPrimeorNot {
public void CheckPrime(int n)
{
	int flag=0;
	for(int i=n-1;i>1;--i)
	{
		if(n%i==0)
		{ 
			flag=1;
			break;
		}
		else
			continue;	}
	if(flag==0)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not Prime");
	}
}
public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		CheckPrimeorNot c=new CheckPrimeorNot();
		c.CheckPrime(n);
				}

}
