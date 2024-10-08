package mypkg;

public class Reverse {

	public static void main(String[] args) {
		int n=959,r=0,d=0;
		int p=n;
		while(n>0)
		{
			d=n%10;  // 9
			r=(r*10)+d; //859
			n=n/10; //0
		}
		System.out.println("Reverse of number " +r);
		if(p==r)
		{
			System.out.println("Paliandrome");
			
		}
		else
		{
			System.out.println("Not Paliandrome");
		}
	}

}
