package array.java;

import java.util.Scanner;

public class perfix {
    static int [] makeprefixsum(int arr [ ]){
        int n = arr.length;
      //  int [] pref = new int [n];
     //   pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
         //   pref[i] = pref[i-1]+arr[i];
arr[i] = arr[i-1] + arr[i];
        }
       // return pref;
        return arr;
    }


static  void printarray(int [] arr){
    for (int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println( );
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
        System.out.println("original array :");
        printarray(arr);
        int [] pref = makeprefixsum(arr);
        printarray(pref);
    }
}
