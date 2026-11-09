package array.java;

import java.util.Scanner;

public class repeatingnumber {
 static int firstReapetingNumber(int arr[]){
 int n = arr.length;
     for (int i = 0; i <n ; i++) {
         for (int j = i+1; j <n ; j++) {
             if(arr[i] ==arr[j]){
                 return arr[i];
             }

         }
     }
 return -1;
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
        System.out.println("firest repeating number :" + firstReapetingNumber(arr));
    }
    }