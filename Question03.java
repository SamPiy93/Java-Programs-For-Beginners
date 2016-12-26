//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.io.*;

class Question03{
	public static void main(String[] args) throws IOException{
		double yards,miles;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("\nMiles : ");
		miles=Double.parseDouble(br.readLine());
		
		System.out.print("\nYards : ");
		yards=Double.parseDouble(br.readLine());		
		
		System.out.println("\nKilometers : "+(((miles)+((1/1760)*yards))*1.6)+"km");
		
	}
}