package mypkg;

import OOPS.AccessMOdifiers;

public class Amstrong {

	public static void main(String[] args) {
	int n=153,r=0,d,a=n;
	do {
		d=n%10;    //3----5---1
		r=r+(d*d*d);// 27----(27+125=152)---(152+1)
		n=n/10; //15  ----1---0
		
	}while(n>0);
	if(r==a)  // 153==153
	{
		System.out.println("Number is amstrong");
		
	}
	else
	{
		System.out.print("Not Amstrong");
	}
	

	

	
	AccessMOdifiers am=new AccessMOdifiers();
	System.out.println(am.d);   // public only 
	}

}
