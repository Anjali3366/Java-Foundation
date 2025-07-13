
// this file include 2d array how to create , declare print and take input of 2d
// array
import java.util.*;

public class A1_basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create the 2d array
        int[][] matrix = new int[2][3];

        // take input from user
        System.out.println("Enter the element of matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // print the 2d array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search the element in matrix
        System.out.println("Enter the key which you want to find : ");
        int key = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length;j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    break;
                } else {
                    System.out.println("Element not found ! ");
                    break;
                }
            }
        }

    }

}