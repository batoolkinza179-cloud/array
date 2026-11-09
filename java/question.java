
        package array.java;

import java.util.Arrays;
import java.util.Scanner;

public class question {
    static int [] smallestandlargestelement(int[]arr){
        Arrays.sort(arr);
        int [] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }
    static boolean isSorted(int arr[]){
        boolean check =true;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }

        }
        return check;
    }
    static int counOccurrences(int []arr ,int x){
        int count =0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] >= x){
                count++;
            }

        }
        return count;
    }

    static int lastoccurrence(int [] arr,int x){
        int lastindex =-1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == x){
                lastindex = i;
            }

        }
        return lastindex;
    }
    static int countOccurrences(int []arr ,int x){
        int count =0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == x){
                count++;
            }

        }
        return count;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter"+n+"elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();


        }
     //   System.out.println("enter x");
     //   int x = sc.nextInt();
      //  System.out.println(" count of x: "+countOccurrences(arr,x));
       // System.out.println("last ocurences of x:" +lastoccurrence(arr,x));
       // System.out.println("count of x: "+counOccurrences(arr,x));
       // System.out.println("is sorted"+ isSorted(arr));
        int [] ans = smallestandlargestelement(arr);
        System.out.println("smallest:" +ans[0]);
        System.out.println("largest: "+ans[1]);
    }
}
