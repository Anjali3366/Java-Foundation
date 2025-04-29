// this file include operation like addition , subtraction and multiplication of two 2d array .

import java.util.*;

public class A2_Operation {
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row  for 1st matrix");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns  for 1st matrix ");
        int cols = sc.nextInt();

        System.out.print("Enter the number of row  for 2nd matrix");
        int row1 = sc.nextInt();
        System.out.print("Enter the number of columns  for 2nd matrix ");
        int cols1 = sc.nextInt();

        if (row == row1 && cols == cols1) {
            System.out.println("Output : ");
        } else {
            System.out.println("Row and columns must be same !");
        }
        int[][] matrix1 = new int[row][cols];
        int[][] matrix2 = new int[row1][cols1];
        int[][] sum = new int[row][cols];

        // input the matrix element
        System.out.println("Enter the element of matrix1 : ");
        input(matrix1);

        System.out.println("Enter the element of matrix2 : ");
        input(matrix2);

        // addition of two matrix
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(sum);

        // subtraction of two matrix

        // multiplication of two matrix

    }

}
