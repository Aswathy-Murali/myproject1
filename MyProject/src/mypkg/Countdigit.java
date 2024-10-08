package mypkg;

public class Countdigit {

	public static void main(String[] args) {
		int n=2345,d,c=0;
		while(n>0)
		{
			
		
			n=n/10;
			c++;
			
		}
		System.out.println("Count " + c);

	}

}
