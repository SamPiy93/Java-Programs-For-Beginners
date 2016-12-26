//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.io.*;

class Question13{
	public static void main(String[] args) throws IOException{
		int rows=6,cols=6;
		File file = new File("student_data.txt");
		FileOutputStream fs = new FileOutputStream(file);
		OutputStreamWriter ow = new OutputStreamWriter(fs);
		BufferedWriter writer = new BufferedWriter(ow);
		
		String studentInfo[][]=new String[rows][cols];
		
		studentInfo[0][0]="Student No";
		studentInfo[0][1]="ST2";
		studentInfo[0][2]="SPD";
		studentInfo[0][3]="PS";
		studentInfo[0][4]="DCCN2";
		studentInfo[0][5]="SE1";
		
		studentInfo[1][0]="DIT/10/C1/0001";
		studentInfo[1][1]="A";
		studentInfo[1][2]="A-";
		studentInfo[1][3]="B+";
		studentInfo[1][4]="A";
		studentInfo[1][5]="A-";
		
		studentInfo[2][0]="DIT/10/M2/0123";
		studentInfo[2][1]="C-";
		studentInfo[2][2]="C";
		studentInfo[2][3]="B";
		studentInfo[2][4]="B";
		studentInfo[2][5]="B+";
		
		studentInfo[3][0]="DIT/10/M1/0054";
		studentInfo[3][1]="D";
		studentInfo[3][2]="C-";
		studentInfo[3][3]="C";
		studentInfo[3][4]="B-";
		studentInfo[3][5]="B";
		
		studentInfo[4][0]="DIT/10/M1/0025";
		studentInfo[4][1]="A";
		studentInfo[4][2]="A";
		studentInfo[4][3]="A-";	
		studentInfo[4][4]="A";
		studentInfo[4][5]="A-";
		
		studentInfo[5][0]="DIT/10/C2/1254";
		studentInfo[5][1]="C";
		studentInfo[5][2]="C-";
		studentInfo[5][3]="B";
		studentInfo[5][4]="B+";
		studentInfo[5][5]="B";
		
		//Traditional for loop
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				writer.write(studentInfo[i][j]+"\t");
			}
			writer.newLine();
			writer.flush();
		}
		fs.close();
	}
}