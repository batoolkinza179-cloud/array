import java.util.Scanner;

public class printsum {
    static int printsum(int[] arr,int target){
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {//first no pic
            for (int j = i+1; j <n ; j++) {// secomd no
                if(arr[i] +arr[j] == target){
                    ans++;
                }

            }



        }
        return ans;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array size");
        int n = sc . nextInt();
        int arr[]= new int [n];

        System.out.println("enter" +n+"elements");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter a target sum");
        int target = sc.nextInt();
        System.out.println(printsum(arr,target));

        }



}
