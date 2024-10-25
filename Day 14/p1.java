import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter num1 : ");
        	int num1 = sc.nextInt();
        	System.out.println("Enter num2 : ");
        	int num2 = sc.nextInt();
        	for(int i = num1; i <= num2; i++) {
            	System.out.print(i % 2 == 1 ? i + " " : "");
        	}
    	}
}

/* O/p:- Enter num1 :
	 4
	 Enter num2 :
	 60
	 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59