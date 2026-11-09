package array.java;

import java.util.Scanner;

public class input {
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println( );
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("enter"+"elements");
        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
printarray(arr);

        }
      //  for (int i = 0; i < n; i++) {
        //    System.out.print(arr[i] +" ");
int [] arr_2 = arr;
        printarray(arr_2);
        }
    
}
