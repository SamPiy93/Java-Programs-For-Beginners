//IT14063442
//Piyasundara H.M.S
//Batch1 C12

import java.util.*;

class Question08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int rows=2,cols=3;
		int matrix1[][]=new int[rows][cols];
		int matrix2[][]=new int[rows][cols];
		int result[][]=new int[rows][cols];

		System.out.println("\nEnter the values of the First Matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix1[i][j]=input.nextInt();
			}
		}

		System.out.println("\nEnter the values of the Second Matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix2[i][j]=input.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		//printing the two matrices and the answer
		System.out.println("\nMatrix1 + Matrix2 = Result");
		for(int i=0;i<rows;i++){
			System.out.print("|");
			for(int j=0;j<cols;j++){
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.print("|  |");
			for(int j=0;j<cols;j++){
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.print("|  |");
			for(int j=0;j<cols;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		
	}
}