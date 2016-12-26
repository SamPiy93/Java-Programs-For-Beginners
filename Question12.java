//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.util.*;

class Question12{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("--Enter the Paragraph--");
		String para=input.nextLine() , word="";
		
		StringTokenizer token=new StringTokenizer(para);
		int count=0;
		
		while(token.hasMoreTokens()){
			word=token.nextToken();
			if(word.charAt(0)=='i'){
				count++;
			}
		}
		System.out.println("\n\t*No.Of. Sentences starts with letter 'I' : "+count);
	}
}