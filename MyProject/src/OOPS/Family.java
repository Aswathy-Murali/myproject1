package OOPS;

public class Family {
	String fname,mname,c1,c2;
	int fage,mage,c1age,c2age;
	public Family(int fage,int mage,int c1age,int c2age,String fname,String mname,String c1,String c2)
	{
		this.fname=fname;
		this.mname=mname;
		this.c1=c1;
		this.c2=c2;
		this.c1=c1;
		this.c1age=c1age;
		this.c2age=c2age;
		this.fage=fage;
		this.mage=mage;
		}
	public void display() {
		System.out.println("Father name :"+ fname +" Age :"+fage);
		System.out.println("Mother name :"+ mname +" Age :"+mage);
		System.out.println("Elder child name :"+ c1 +" Age :"+c1age);
		System.out.println("Younger child name :"+ c2 +" Age :"+c2age);
	}

	public static void main(String[] args) {
		Family fob=new Family(34,29,4,2,"Shabin","Aswathy","Neyhal","Rayhaan");
		fob.display();
		
		
		
		AccessMOdifiers am=new AccessMOdifiers();
		System.out.println("b="+am.b+"c="+am.c+"d="+am.d) ;  // protected,default and public only
		
	}

}
