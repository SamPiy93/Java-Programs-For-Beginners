//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.util.*;

class Question10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int digits=0,letters=0;
		String word="";
		System.out.println("\nEnter the Paragraph\n");
		String paragraph=input.nextLine();
		
		StringTokenizer token=new StringTokenizer(paragraph);
		
		while(token.hasMoreTokens()){
				word=token.nextToken();
				letters=letters+word.length();
				
				for(int i=0;i<word.length();i++)
				{
					if(Character.isDigit(word.charAt(i)))
						digits++;
				}				
		}
		letters=letters-digits;
		
		System.out.println("\n\tNo.Of.Letters : "+letters);
		System.out.println("\n\tNo.Of.Spaces : "+(paragraph.length()-letters-digits));
		System.out.println("\n\tNo.Of.Digits : "+digits);
	}
}