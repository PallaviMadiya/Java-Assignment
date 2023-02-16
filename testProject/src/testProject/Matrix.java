package testProject;
import java.util.Scanner;

public class Matrix {
	public static void main(String[]args) {
		int row, col, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows in Matrix: ");
		row = sc.nextInt();
		System.out.print("\nEnter number of columns in Matrix: ");
		col = sc.nextInt();
		
		int[][] matrixOne = new int[row][col];  		
		int[][] matrixTwo = new int[row][col];  		

		//Taking Input
		System.out.println("Enter Elements Of First Matrix:");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(String.format("Enter Element [%d %d]: ",i+1,j+1));
				matrixOne[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nEnter Elements Of Second Matrix:");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(String.format("Enter Element [%d %d]: ",i+1,j+1));
				matrixTwo[i][j] = sc.nextInt();
			}
		}
		
		//Printing Both Matrices
		System.out.println("\nFirst Matrix");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(matrixOne[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("\nSecond Matrix");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(matrixTwo[i][j]+"  ");
			}
			System.out.println();
		}
		
		//Addition Of Two Matrices
		int[][] matrixSum = new int[row][col];
		
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
			}
		}
		
		System.out.println("\nAddtion Of First & Second Matrix");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(matrixSum[i][j]+"  ");
			}
			System.out.println();
		}
		
		//Subtraction Of Two Matrices
				int[][] matrixSub = new int[row][col];
				
				for(i = 0; i < row; i++) {
					for(j = 0; j < col; j++) {
						matrixSub[i][j] = matrixOne[i][j] - matrixTwo[i][j];
					}
				}
				
				System.out.println("\nSubtraction Of First & Second Matrix");
				for(i = 0; i < row; i++) {
					for(j = 0; j < col; j++) {
						System.out.print(matrixSub[i][j]+"  ");
					}
					System.out.println();
				}
	}
}
