//IT14063442
//Piyasundara H.M.S
//Batch1 C12

class Question06{
	public static void main(String[] args){

		int x=0;
		for(int i=9;i>0;i--){
			//if statement to ignore the line which prints 6
			
			if(i==6){
				x=x+2;
				continue;
			}
			
			for(int j=0;j<i;j++){
				System.out.print(i);
			}
			
			for(int y=x; y>0; y--)
				System.out.print(" ");
			
			for(int k=i;k>0;k--){
				System.out.print(i);
			}
			
			System.out.println();
			x=x+2;
		}
	}
}

