import java.util.*;

class Demo{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number 1");
	int a=sc.nextInt();
	System.out.println("enter number 2");
	int b=sc.nextInt();
	Codex chavi= new Codex();
	chavi.add(a,b);
	chavi.sub(a,b);
	}
}

class Codex{
		void add(int a,int b){
			System.out.println("addition is : "+(a+b));
			}
		void sub(int a,int b){
		if(b>a){
			System.out.println("substraction is : "+(b-a));
			}else{
			System.out.println();
    		 	}
 		}
}

/* O/p:- enter number 1
	 10
	 enter number 2
	 20
	 addition is : 30
	 substraction is : 10
*/