//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.util.*;

class Question09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String mail;
		
		System.out.println("\nEnter the E-Mail address");
		mail=input.nextLine();
		
		System.out.println("\nE-Mail : "+mail);
		System.out.println("\nUserName : "+mail.substring(0,mail.indexOf('@')));
	}
}