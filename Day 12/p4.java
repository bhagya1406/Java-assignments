import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number 1");
	int a= sc.nextInt();
	System.out.println("enter number 2");
	int b = sc.nextInt();
	System.out.println("sign of operation");
	char sign = sc.next().charAt(0);
	
	switch(sign){
		case '+': System.out.println("addition of " + a + "&" + b + "is" + (a+b));
			  break;
		case '-': System.out.println("substraction of " + a + "&" + b + "is" + (a-b));
			  break;
		case '*': System.out.println("multiplication of " + a + "&" + b + "is" + (a*b));
			  break;
		case '/': System.out.println("division of " + a + "&" + b + "is" + (a/b));
			  break;
		}
	}
}

/* O/p:- enter number 1
	 10
	 enter number 2
	 20
	 sign of operation
	 +
	 addition of 10 & 20 is 30
*/		