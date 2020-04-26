package calculator;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------Calculator( op1 operator op2)-----------");
		int a= sc.nextInt();
		char b= sc.next().charAt(0);
		int c=sc.nextInt();
				
		switch(b) {
	     
		case '+': 	System.out.println("Ans "+(a+c));
		            break;
		case '-': 	System.out.println("Ans "+(a-c));
                    break;
		case '*': 	System.out.println("Ans "+(a*c));
                    break;
		case '/': 	System.out.println("Ans "+(a/c));
                    break;
		case '%': 	System.out.println("Ans "+(a%c));
                    break;
		default:	System.out.println("Enter a correct operator");
                    break;
		}
			
	}
}
