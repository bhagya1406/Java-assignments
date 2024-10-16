class Demo{
	public static void main(String[]args){
		int a=5;
		int num;
		for(int i=4;i>=1;i--){
			num=i;
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}

/* O/p:- 4 3 2 1
	 3 2 1
	 2 1
	 1
*/
