import java.util.Scanner;

public class tripletsum {


    static int tripletsum(int[]arr, int target){

        int ans = 0;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {// first nu
            for (int j =i+1 ; j <n ; j++) {// second nu
                for (int k = j+1; k < n; k++) {// third nu
                    if(arr[i] +arr[j] +arr[k] == target){
                        ans++;
                    }

                }

            }

        }
        return ans;

    }

    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a array size");
        int n = sc.nextInt();
        int []arr=new int [n];

        System.out.println("enter"+n+"elements");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter a target sum");
        int target = sc.nextInt();
        System.out.println(tripletsum(arr,target));

        }



}
