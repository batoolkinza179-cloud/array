import java.util.Scanner;

public class RangeQuery {
    static int [] makeprefixsumarray(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;

        }

    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter  array size");
        int n = sc.nextInt();
        int[]arr = new int [n+1];

        System.out.println("enter" +n+"elements");
        for (int i = 1; i <=n ; i++) {
            arr[i] = sc.nextInt();


        }
        int [] prefsum = makeprefixsumarray(arr);

        System.out.print("enter a number of quries");
        int q = sc.nextInt();
        while (q-->0){
            System.out.println("enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans =prefsum[r]-prefsum[l-1];
            System.out.println("sum"+ans);
    }
    }
}
