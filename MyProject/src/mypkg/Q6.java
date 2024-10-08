package mypkg;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
	int a[]=new int[30];
	Scanner sc=new Scanner(System.in);
	int o=0,e=0,n,i;
	System.out.println("Enter size");
	n=sc.nextInt();
	System.out.println("Enter elements");
	for(i=0;i<n;++i)
	{
		a[i]=sc.nextInt();
		if(a[i]%2==0)
		{
			e++;
		}
		else
		{
			o++;
		}
	
	}
	System.out.println("Odd numbers ="+ o);
	System.out.println("Even numbers ="+ e);
	}

}
