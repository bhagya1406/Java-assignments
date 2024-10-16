class Demo{
	public static void main(String[]args){
		int a=5;
		for(int i=1;i<=4;i++){
			a--;
			for(int j=1;j<=4;j++){
				if(j>=i){
					System.out.print(a+" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

/* O/p:- 4 4 4 4
  	   3 3 3
    	     2 2
      	       1
*/
