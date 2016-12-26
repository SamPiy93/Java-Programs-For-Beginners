//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.util.*;

class Question11{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int no1=0,no2=0;
		char ch;
		do{
			System.out.println("\t* : for multiplication");
			System.out.println("\t/ : for division");
			System.out.println("\t+ : for addition");
			System.out.println("\t- : for subtraction");
			System.out.println("\tq : to Exit");
			
			System.out.print("\nEnter your Selection: ");
			ch=input.next().charAt(0);

			if(ch!='q'){
				System.out.print("\nEnter 1st number : ");
				no1=input.nextInt();
				System.out.print("\nEnter 2nd number : ");
				no2=input.nextInt();
			}
			switch (ch){
				case '*':System.out.println("\nAnswer: "+(no1*no2));
							break;
				case '/':System.out.println("\nAnswer: "+(no1/no2));
							break;
				case '+':System.out.println("\nAnswer: "+(no1+no2));
							break;
				case '-':System.out.println("\nAnswer: "+(no1-no2));
							break;
				case 'q':break;
				default :System.out.println("\nInvalid operation!");
			}
			System.out.println("\n--------------------------------");
		}while(ch!='q');
	}
}