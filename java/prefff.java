package array.java;

import java.util.Scanner;

public class prefff {

    static int [] makeprefixsum(int arr []){
        for (int i = 1; i < arr.length ; i++) {
            arr[i] +=arr[i-1];

        }
        return arr;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("enter" + n + "elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();

        }
        int [] pref = makeprefixsum(arr);
        System.out.print("enter no of queries");
        int q = sc.nextInt();
        while (q--> 0){
            System.out.println("enter a range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans =pref[r] -pref[l-1];
            System.out.println("sum" + ans);
        }

    }
}
