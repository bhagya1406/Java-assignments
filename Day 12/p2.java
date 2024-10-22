import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number 1");
	int a = sc.nextInt();
	System.out.println("enter number 2");
	int b = sc.nextInt();
	Codex chavi = new Codex();
	chavi.multiplication(a,b);
	chavi.division(a,b);
	}
}

class Codex{
	void multiplication(int a, int b){
		System.out.println("multiplication is :" +(a*b));
	}
	void division(int a , int b){
		if (b>a){
			System.out.println("division is : " +(b/a));
		}else{
			System.out.println();
		}
	}
}

/* O/p:- enter number 1
	 10
	 enter number 2
	 20
	 multiplication is :200
	 division is : 2
*/