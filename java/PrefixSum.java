import java.util.Scanner;

public class PrefixSum {

    static void printarray(int  [] arr){}

    static int [] makePrefixSumarray(int []arr){
        int n = arr.length;


        for (int i = 1; i <n ; i++) {
            arr[i] =arr[i-1] + arr[i];

        }
        return arr;


    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a array size");
        int n = sc.nextInt();
        int []arr=new int[n+1];

        System.out.println("enter" + n + "elements");
        for (int i = 1; i <=n ; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.println("enter a number of queries");
        int q =sc.nextInt();

        int[] pref = makePrefixSumarray(arr);
        printarray(pref);
    }
}
