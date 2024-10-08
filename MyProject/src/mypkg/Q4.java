package mypkg;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		int [] a=new int[30];
		int n,l,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		System.out.println("Enter elements");
   for( i=0;i<n;++i)
   {
	   a[i]=sc.nextInt();
   }
   l=a[0];
   for(i=0;i<n;++i)
   {
	  if(a[i]>l)
	  {
		  l=a[i];
	  }
   }
   System.out.println("largest "+l);
   }

}
