//IT14063442
//Piyasundara H.M.S
//Batch1 C12

class Question02{
	public static void main(String[] args){
		System.out.print("\nGiven Decimal Value : 152");

		int number=152;
		int modNumb=0;

		String answer="";
		
		do{
			modNumb=number%8;
			number=number/8;
			answer=modNumb+answer;
		}while(number!=0);
		
		System.out.println("\nDecimal Value in Octal : "+answer);
	}
}