//IT14063442
//Piyasundara H.M.S
//Batch1 C12

class Question05{
	public static void main(String[] args){
	
		double gpa=Double.parseDouble(args[0]);//command line argument
		
		if(gpa>=3.6 && gpa<=4.0){
			System.out.println("\nClass : First Class Hons");
		}else if(gpa<3.6 && gpa>=3.4){
			System.out.println("\nClass : Upper Second Class Hons");
		}else if(gpa<3.4 && gpa>=3.0){
			System.out.println("\nClass : Lower Second Class Hons");
		}else if(gpa<3.0 && gpa>=2.0){
			System.out.println("\nClass : Pass");
		}else if(gpa>4.0 || gpa<0){
			System.out.println("\nNot Valid GPA!!");
		}
	}
}