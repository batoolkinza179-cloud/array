package array.java;

import java.util.Scanner;

public class TransposeofMAtrix {

    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    static int [] [] findTranspose(int [] [] matrix, int r,int c){
        int ans [] [] = new int [c][r];
        for (int i = 0; i <c ; i++) {
            for (int j = 0; j <r ; j++) {
                ans[i][j] = matrix[j][i];

            }

        }
        return ans;
    }
    static void transposeinmatrix(int matrix[][] ,int r,int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
    }
    static void reversearray(int [] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int matrix[] [],int n) {
        transposeinmatrix(matrix, n, n);
        for (int i = 0; i < n; i++) {

            reversearray(matrix[i]);

        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and columns of matrix 1");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("enter a matrix values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }}
        System.out.println("input matrix");
        printmatrix(matrix);
       // System.out.println("transpose of matrix");
      //  int [] [] ans = findTranspose(matrix,r,c);
      //  printmatrix(ans);
      //  transposeinmatrix(matrix,r,c);
      //  printmatrix(matrix);
        rotate(matrix,r);
        System.out.println("rotation of matrix");
        printmatrix(matrix);
    }
}
