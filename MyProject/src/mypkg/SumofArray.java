package mypkg;
import java.util.Scanner;
public class SumofArray {

	public static void main(String[] args) {

int i,n,sum=0;
int []A=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array");
n=sc.nextInt();
System.out.println("Enter numbers");
for(i=0;i<n;++i)
{
	A[i]=sc.nextInt();
	sum=sum+A[i];
}
System.out.println("Array numbers are");
for(int temp:A) //for each concept
{
	System.out.println(temp);
}
System.out.println("Sum of numbers " + sum);

	}

}
