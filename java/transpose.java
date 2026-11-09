import java.util.Scanner;

public class transpose {
    static void printmatrix(int[][] matrix) {
    }

    static int[][] findtranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];

            }

        }
        return ans;


    }

    static void transposeinplace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                //swap marix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelments = r * c;
        System.out.println("enter" + totalelments + "values");
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                {

                }

            }
            System.out.println("input matrix");
            printmatrix(matrix);
            System.out.println("transpose of matrix");
            transposeinplace(matrix, r, c);
            printmatrix(matrix);
            //  int [][]ans = findtranspose(matrix,r,c);
            // printmatrix(ans);
        }
    }
}
