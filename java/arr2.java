package array.java;

import java.util.Scanner;

public class arr2 {
    static void printarray(int [] [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] +" ");

            }
            System.out.println( );

        }
    }
    static void main(String[] args) {
        //  int [] [] arr = new int[2] [3];
        // int [] [] arr2 = {{1,2,3},{4,5,6},{7,8,9} };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int r = sc.nextInt();
        System.out.println("enter no of columns");
        int c = sc.nextInt();
        int [] [] arr = new int [r][c];
        System.out.println("enter" + r*c + "elements");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                arr[i] [j] = sc.nextInt();

            }

        }
        printarray(arr);
    }

}