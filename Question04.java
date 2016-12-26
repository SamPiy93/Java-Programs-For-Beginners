//IT14063442
//Piyasundara H.M.S
//Batch1 C12

class Question04{
	public static void main(String[] args){
		//method 3
		int x=5;
		
		while(x!=-1){
			for(int i=x;i>0;i--){
				System.out.print(" ");
			}
			for(int j=5;j>0;j--){
				if(x==2){
					if(j==1){
						break;
					}
				}
				System.out.print("& ");
			}
			System.out.println();
			x--;
		}
		
		/*
		//method 2
		int x=5;
		while(x!=-1){
			for(int i=x;i>0;i--){
				System.out.print(" ");
			}
			if(x==2){
				System.out.println("& & & &");
			}else{
				System.out.println("& & & & &");
			}
			x--;
		}
		*/
		/*
		//method 1
		int x=0;
		while(x<6){
			if(x==0){
				System.out.print("     ");
				}else if(x==1){
					System.out.print("    ");
					}else if(x==2){
						System.out.print("   ");
						}else if(x==3){
							System.out.println("  & & & &");
							x++;
							continue;
							}else if(x==4){
								System.out.print(" ");
								}else{
									System.out.println("& & & & &");
									break;
								}
			System.out.println("& & & & &");
			x++;
		}
		*/		
	}
}