import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number 1");
	int a = sc.nextInt();
	System.out.println("enter number 2");
	int b = sc.nextInt();
	Codex chavi = new Codex();
	chavi.cubes(a,b);
	chavi.square(a,b);
	}
}

class Codex{
	void cubes(int a, int b){
		int x=a*a*a;
		int y=b*b*b;
		int sum = x+y;
			System.out.println("addition of cubes :" +sum);
		}
	void square(int a, int b){
		int c=a*a;
		int d=b*b;
		int sub = c-d;
			System.out.println("substraction of square :" +sub);
	}
}

/* O/p:- enter number 1
	 10
	 enter number 2
	 20
	 addition of cubes :9000
	 substraction of square :-300
*/