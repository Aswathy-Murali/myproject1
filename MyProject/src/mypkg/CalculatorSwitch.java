package mypkg;

public class CalculatorSwitch {

	public static void main(String[] args) {
		int a=13,b=5;
		char ch='%';
		switch (ch)
		{
		case '+': System.out.println("result " +(a+b));
		break;
		
		case '*': System.out.println("result " +a*b);
		break;
		
		
	case '-': System.out.println("result "  +(a-b));
	break;
	case '/': System.out.println("result " +a/b);
	break;
	case '%': System.out.println("result " +a%b);
	break;
	default: System.out.println("Invalid");
	}
	}
}
