import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Number");
		int c = sc.nextInt();
			if(a>b && a>c){
				System.out.println("The Maximum number amongst  "  +a  +b  +" & "  +c  +" is "  +a );
			}else if(b>c && b>a) {
				System.out.println("The Maximum number amongst  "  +a  +b  +" & "  +c  +" is "  +b );
			}else if(c>a && c>b) {
				System.out.println("The Maximum number amongst  "  +a  +b  +" & "  +c  +" is "  +c );
			}else {
				System.out.println();
	
			}
	}
}

/* O/p:- Enter 1st Number
	 56
	 Enter 2nd Number
	 7
	 Enter 3rd Number
	 99
	 The Maximum number amongst  56 7 & 99 is 99
*/