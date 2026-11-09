package array.java;

import java.util.Scanner;

public class presentqurey {
     int makeFrequencyArray(int[] arr) {
        int[] freq = new int[100];
        for (int i = 0; i < arr.length; i++) {
        freq [arr[i]]  =  freq[arr[i]]++;

        }
        return freq[100];
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
        int [] freq = new int [100];
        System.out.println("enter no of quries");
        int q = sc.nextInt();
        while (q>0){
            System.out.println("enter no to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
            q--;
        }
    }
}
