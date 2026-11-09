package array.java;

import java.util.Scanner;

public class rotateinplace {
    static void swapinarraey(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reversearray(int[] arr, int i,int j){

        while (i<j){
            swapinarraey(arr,i,j);
            i++;
            j--;
        }

    }
    static  void printarray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    static void rotateinplaceees(int arr[] ,int k){
        int n = arr.length;
        k=k%n;
        reversearray(arr,0,n-1-k);
        reversearray(arr,n-k,n-1);
        reversearray(arr,0,n-1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("enter k : ");
        int k = sc.nextInt();
        System.out.println("original array");
        printarray(arr);
        rotateinplaceees(arr,k);
        System.out.println("array after rotation");
        printarray(arr);
    }
}
