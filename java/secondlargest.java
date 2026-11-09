import java.util.Scanner;

public class secondlargest {
    static int findmax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >mx){
                mx = arr[i];
            }

        }
        return mx;
    }
    static int findSecondMax(int arr []){
        int mx= findmax(arr);
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == mx) {
                arr[i]= Integer.MIN_VALUE;

            }

        }
        int secondMax = findmax(arr);
        return secondMax;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter"+n+"elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("second maximum element: "+findSecondMax(arr));


    }
}
