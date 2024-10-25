import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter num1 : ");
        	int num1 = sc.nextInt();
        	System.out.println("Enter num2 : ");
        	int num2 = sc.nextInt();
        	for(int i = num1; i <= num2; i++) {
            	System.out.print(i % 2 == 0 ? "\n\nSqr of " + i +  " : " + i * i + "\nCube of " + i + " : " + i * i * i : "");
        	}
    	}
}

/* O/p:- Enter num1 :
	 10
	 Enter num2 :
	 10

	 Sqr of 10 : 100
	 Cube of 10 : 1000

	 Enter num1 :
	 2
	 Enter num2 :
	 2

	 Sqr of 2 : 4
	 Cube of 2 : 8
*/