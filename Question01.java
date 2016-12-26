//IT14063442
//Piyasundara H.M.S
//Batch1 C12

class Question01{
	public static void main(String[] args){
		double feet=Double.parseDouble(args[0]);
		double inches=Double.parseDouble(args[1]);
		
		

		System.out.println("\nFeet : "+feet+"\n\nInches : "+inches);

		System.out.println("\nHeight : "+((feet*0.3)+(inches*0.025))+"m");
	}
}