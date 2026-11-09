import java.util.Scanner;

public class reverse {
    static int findarraysum(int[]arr){

    int totalsum =0;
        for (int i = 0; i <arr.length ; i++) {
            totalsum+= arr[i];
        }
        return totalsum;

        }

   static   boolean equalsumpartition(int arr[]){
        int totalsum =findarraysum(arr);
        int prefsum =0;
       for (int i = 0; i <arr.length ; i++) {
           prefsum += arr[i];

           int suffixsum = totalsum -prefsum;
           if (suffixsum==prefsum){
               return true;
           }


       }
       return false;

    }

 public   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a array size");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter "+n+"elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }

        System.out.println("equal partition posssible:"+equalsumpartition(arr));
    }
}


