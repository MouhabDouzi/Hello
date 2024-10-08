package matrix;

	import java.util.Scanner;

	public class multiply{

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter the number of rows in matrix A: ");
	        int rowsA = sc.nextInt();
	        System.out.print("Enter the number of columns in matrix A: ");
	        int colsA = sc.nextInt();

	        int[][] matrixA = new int[rowsA][colsA];
	        System.out.println("Enter the elements of matrix A:");
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsA; j++) {
	                matrixA[i][j] = sc.nextInt();
	            }
	        }

	        
	        System.out.print("Enter the number of rows in matrix B: ");
	        int rowsB = sc.nextInt();
	        System.out.print("Enter the number of columns in matrix B: ");
	        int colsB = sc.nextInt();

	        // Check if matrix multiplication is possible
	        if (colsA != rowsB) {
	            System.out.println("Matrix multiplication is not possible. Columns of A must equal rows of B.");
	       
	        }

	        int[][] matrixB = new int[rowsB][colsB];
	        System.out.println("Enter the elements of matrix B:");
	        for (int i = 0; i < rowsB; i++) {
	            for (int j = 0; j < colsB; j++) {
	                matrixB[i][j] = sc.nextInt();
	            }
	        }

	       
	        int[][] resultMatrix = new int[rowsA][colsB];

	        // Matrix multiplication logic
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
	                }
	            }
	        }

	        
	        System.out.println("Result of matrix multiplication:");
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();  // Move to the next line after each row
	        }

	        sc.close();
	    }
}
