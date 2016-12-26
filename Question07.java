//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.util.*;

class Question07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the GPA : ");
		double gpa=input.nextDouble();
//-----------------------------2nd Method---------------------------------------
		int grade=(int)(gpa*2);
		
		switch(grade){
			case 8:
			case 7:System.out.print("\nCLASS: First Class Hons\n");
					break;
			case 6:System.out.print("\nCLASS: Upper Second Class Hons\n");
					break;
			case 5:System.out.print("\nCLASS: Lower Second Class Hons\n");
					break;
			case 4:System.out.print("\nCLASS: Pass\n");
					break;
			case 3:
			case 2:
			case 1:
			case 0:System.out.print("\nCLASS: Fail\n");
					break;
			default:System.out.print("\nInvalid GPA !!!\n");
		}
		
		
/*1st Method		
		int grade=(int)(gpa*10);
		
		switch (grade){
			case 40:
			case 39:
			case 38:
			case 37:
			case 36:
			case 35:System.out.print("\nCLASS: First Class Hons");
					break;
			case 34:
			case 33:
			case 32:
			case 31:
			case 30:System.out.print("\nCLASS: Upper Second Class Hons");
					break;
			case 29:
			case 28:
			case 27:
			case 26:
			case 25:System.out.print("\nCLASS: Lower Second Class Hons");
					break;
			case 24:
			case 23:
			case 22:
			case 21:
			case 20:System.out.print("\nCLASS: Pass");
					break;
			case 19:
			case 18:
			case 17:
			case 16:
			case 15:
			case 14:
			case 13:
			case 12:
			case 11:
			case 10:
			case 9:
			case 8:
			case 7:
			case 6:
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:System.out.print("\nCLASS: Fail");
					break;
			default:System.out.print("\nInvalid GPA !!!");
		}
*/
	}
}