package testProject;
import java.util.Scanner;

public class matrixMultiplication {
	public static void main(String[] args) {
		int row1, col1, row2, col2, i, j, k;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows in first matrix: ");
		row1 = sc.nextInt();
		System.out.print("Enter number of columns in first matrix: ");
		col1 = sc.nextInt();
		System.out.print("Enter number of rows in second matrix: ");
		row2 = sc.nextInt();
		System.out.print("Enter number of columns in second matrix: ");
		col2 = sc.nextInt();
		
		if(col1 != row2) {
			System.out.print("Multiplication Is Not Possible!");
		}
		else {
			int[][] matrixOne = new int[row1][col1];
			int[][] matrixTwo = new int[row2][col2];
			
			System.out.println("\nEnter Elements Of First Matrix");
			for(i = 0; i < row1; i++) {
				for(j = 0; j < col1; j++) {
					System.out.print(String.format("Enter Element[%d %d]:",i+1,j+1 ));
					matrixOne[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("\nEnter Elements Of Second Matrix");
			for(i = 0; i < row2; i++) {
				for(j = 0; j < col2; j++) {
					System.out.print(String.format("Enter Element[%d %d]:",i+1,j+1 ));
					matrixTwo[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("\nFirst matrix");
			for(i = 0; i < row1; i++) {
				for(j = 0; j < col1; j++) {
					System.out.print(matrixOne[i][j]+"  ");
				}
				System.out.println();
			}
			
			System.out.println("\nSecond matrix");
			for(i = 0; i < row2; i++) {
				for(j = 0; j < col2; j++) {
					System.out.print(matrixTwo[i][j]+"  ");
				}
				System.out.println();
			}
			
			int[][] matrixMul = new int[row1][col2];
			//Matrix Multiplication
			for(i = 0; i < row1; i++) {
				for(j = 0; j < col2; j++) {
					for(k = 0; k < row2; k++) {
						matrixMul[i][j] += matrixOne[i][k] * matrixTwo[k][j];
					}
				}
			}
			
			//Print Multiplication Result
			System.out.println("\nMultiplication Of First & Second Matrix");
			for(i = 0; i < row1; i++) {
				for(j = 0; j < col2; j++) {
					System.out.print(matrixMul[i][j]+"  ");
				}
				System.out.println();
			}
			
		}
		sc.close();
		
	}
}
