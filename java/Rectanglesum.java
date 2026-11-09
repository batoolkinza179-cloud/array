package array.java;

import java.util.Scanner;

public class Rectanglesum {
    static int findsum(int [][] matrix, int l1, int l2, int r1,int r2){
        int sum =0;
        for (int i = l1; i <=l2; i++) {
            for (int j = r1; j <=r2 ; j++) {
                sum += matrix[i][j];

            }
        }
        return sum;
    }
    static void findprefixsummatrix(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i <r ; i++) {
            for (int j = 1; j <c ; j++) {
                matrix[i][j] += matrix[i][j-1];

            }
        }
        for (int j = 0; j<c ; j++) {
            for (int i = 1; i <r ; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    static int findsum2(int [][] matrix, int l1, int l2, int r1,int r2) {
        int sum = 0;
        findprefixsummatrix(matrix);
        for (int i = l1; i <= l2; i++) {
            if(r1>1)
            sum+= matrix[i][r2] -matrix[i][r1-1];
            else
                sum += matrix[i][r2];
        }
        return sum;
    }
    static int findsum3(int [][] matrix, int l1, int l2, int r1,int r2) {
        int ans = 0 ,sum=0, up = 0, left =0, leftup =0;
        findprefixsummatrix(matrix);
        sum  = matrix[l2][r2];
        if(r1>=1)
        left = matrix[l2] [r1-1];
        if(l1>=1)
        up = matrix[l1-1][r2];
       if( l1 >=1 && r1>=1)
        leftup = matrix[l1-1][r1-1];
        ans = sum-up-left+leftup;

        return ans ;

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [ ][] matrix =  new int [r][c];
        int totalelements = r*c;
        System.out.println("enter" + totalelements +" value");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("enter  rectangle bounderies l1,r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
int l2 = sc.nextInt();
int r2 = sc.nextInt();
        System.out.println("rectangle sum"+ findsum(matrix,l1,l2,r1,r2));
        System.out.println("rectangle sum"+ findsum3(matrix,l1,l2,r1,r2));
    }
    }

