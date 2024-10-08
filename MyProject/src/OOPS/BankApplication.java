package OOPS;

import java.util.Scanner;

interface Bank
{
	public void AccountDetails();
	public void Balance();
	public void Withdraw();
	public void Deposit();
}

class SBI implements Bank
{
	Scanner sc=new Scanner(System.in);
	double balance=250000;
	String name,ifsc,accno;
	@Override
	public void AccountDetails() {
		System.out.println("State Bank Of India");	
		System.out.println("---------------------");	
		System.out.println("Customer Name: "+name);		
		System.out.println("IFSC Code: "+ifsc);	
		System.out.println("Account balance: "+balance);
		
		
	}
	@Override
	public void Balance() {
		System.out.println("Account balance: "+balance);
		
	}
	@Override
	public void Deposit() {
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		System.out.println("Account balance: "+(balance+amount));
		
	}
	@Override
	public void Withdraw() {
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		if(amount<=balance)
		{
			System.out.println("Amount withdraw Successfully");
			System.out.println("Account balance: "+(balance-amount));
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}


class FederalBank implements Bank
{
	Scanner sc=new Scanner(System.in);
	double balance=250000;
	String name,ifsc,accno;
	@Override
	public void AccountDetails() {
		System.out.println("Federal Bank");	
		System.out.println("---------------------");	
		System.out.println("Customer Name: "+name);		
		System.out.println("IFSC Code: "+ifsc);	
		System.out.println("Account balance: "+balance);
		
		
	}
	@Override
	public void Balance() {
		System.out.println("Account balance: "+balance);
		
	}
	@Override
	public void Deposit() {
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		System.out.println("Account balance: "+(balance+amount));
		
	}
	@Override
	public void Withdraw() {
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		if(amount<=balance)
		{
			System.out.println("Amount withdraw Successfully");
			System.out.println("Account balance: "+(balance-amount));
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}


class Canera implements Bank
{
	Scanner sc=new Scanner(System.in);
	double balance=250000;
	String name,ifsc,accno;
	@Override
	public void AccountDetails() {
		System.out.println("Canera Bank");	
		System.out.println("---------------------");	
		System.out.println("Customer Name: "+name);		
		System.out.println("IFSC Code: "+ifsc);	
		System.out.println("Account balance: "+balance);
		
		
	}
	@Override
	public void Balance() {
		System.out.println("Account balance: "+balance);
		
	}
	@Override
	public void Deposit() {
		System.out.println("Enter Deposit amount");
		int amount=sc.nextInt();
		balance=balance+amount;
		System.out.println("Account balance: "+(balance));
		
	}
	@Override
	public void Withdraw() {
		System.out.println("Enter Withdraw amount");
		int amount=sc.nextInt();
		if(amount<=balance)
		{
			System.out.println("Amount withdraw Successfully");
			balance=balance-amount;
			System.out.println("Account balance: "+(balance));
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		do {	
			System.out.println("1. SBI");
			System.out.println("2. Federal Bank");
			System.out.println("3. Canera");
			System.out.println("--------------");
			System.out.println("Enter your choice");
			int c=sc.nextInt();
		switch(c)
		{
		case 1: 
		{
			SBI sbi=new SBI();
			System.out.println("Enter Name");		
			sbi.name=sc.next();
			System.out.println("Enter Account number");		
			sbi.accno=sc.next();
			System.out.println("Enter IFSC");		
			sbi.ifsc=sc.next();
			System.out.println("1. AccountDetails");	
			System.out.println("2. Balance");	
			System.out.println("3. Deposit");	
			System.out.println("4. Withdraw");	
			System.out.println("Enter choice");	
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:sbi.AccountDetails();
			break;
			case 2:sbi.Balance();
			break;
			case 3:sbi.Deposit();
			break;
			case 4:sbi.Withdraw();
			break;
			default:System.out.println("Wrong choice");	
			}	
			
			break;
			
		}
		case 2: 
		{
			FederalBank fb=new FederalBank();
			System.out.println("Enter Name");		
			fb.name=sc.next();
			System.out.println("Enter Account number");		
			fb.accno=sc.next();
			System.out.println("Enter IFSC");		
			fb.ifsc=sc.next();
			System.out.println("1. AccountDetails");	
			System.out.println("2. Balance");	
			System.out.println("3. Deposit");	
			System.out.println("4. Withdraw");	
			System.out.println("Enter choice");	
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:fb.AccountDetails();
			break;
			case 2:fb.Balance();
			break;
			case 3:fb.Deposit();
			break;
			case 4:fb.Withdraw();
			break;
			default:System.out.println("Wrong choice");	
			}	
			break;
			
		}
		case 3: 
		{
			Canera cb=new Canera();
			System.out.println("Enter Name");		
			cb.name=sc.next();
			System.out.println("Enter Account number");		
			cb.accno=sc.next();
			System.out.println("Enter IFSC");		
			cb.ifsc=sc.next();
			System.out.println("1. AccountDetails");	
			System.out.println("2. Balance");	
			System.out.println("3. Deposit");	
			System.out.println("4. Withdraw");	
			System.out.println("Enter choice");	
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:cb.AccountDetails();
			break;
			case 2:cb.Balance();
			break;
			case 3:cb.Deposit();
			break;
			case 4:cb.Withdraw();
			break;
			default:System.out.println("Wrong choice");	
			}	
			break;
			
		}
		default:System.out.println("Wrong choice");	
		}
		}
	
		System.out.println("Do you want to continue?(0/1)");	
		int n=sc.nextInt();
	while(n==1);
					
		
	}
}

	


