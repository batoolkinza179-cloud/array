package array.java;

import java.util.Scanner;

public class twopointer {


static  void printarray(int [] arr){
    for (int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println( );
}
static void swapinarraey(int arr[],int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
static void sortarraybyparity(int arr []){
    int n = arr.length;
    int left =0, right = n-1;
    while (left<=right){
        if(arr[left]%2 ==1 && arr[right] %2 == 0){
            swapinarraey(arr,left,right);
            left++;
            right--;
        }
        if(arr[left] %2 ==0){
            left++;
        }
        if ((arr[right]%2==1)){
            right--;
        }
    }
}
    static void reversearray(int[] arr){
int i =0, j= arr.length-1;
        while (i<j){
            swapinarraey(arr,i,j);
            i++;
            j--;
        }

    }
    static int [] sortsquare(int arr[]){
    int n = arr.length;
    int left =0, right = n-1;
    int []ans = new  int [n];
    int k = 0;
    while (left<=right){
        if(Math.abs(arr[left])>Math.abs(arr[right])){
            ans[k++] =arr[left]* arr[left];
            left++;

        }
        else{
            ans[k++] = arr[right] * arr[right];
            right--;
        }
    }
    return  ans;
    }
static void sortzeroandone(int arr []){
    int n = arr.length;
    int left = 0, right = n-1;
    while (left<=right){
        if(arr[left] ==1 && arr[right] ==0){
            swapinarraey(arr,left,right);
            left++;
            right--;
        }
        if (arr[left] ==0){
            left++;
        }
        if (arr[right] ==1){
            right--;
        }
    }

}
//static void sortzeroandone(int arr []){
 //   int n = arr.length;
 //   int zeroes = 0;
 //   for (int i = 0; i <n ; i++) {
  //      if(arr[i] == 0){
    //        zeroes++;
   //     }
  //  }
 //   for (int i = 0; i <n ; i++) {
    //    if(i<zeroes){
      //      arr[i] =0;
     //   }
   //     else {
     //       arr[i] = 1;
  //      }

  //  }
//}
  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("original array :");
        printarray(arr);
      //  sortarraybyparity(arr);
      //  sortzeroandone(arr);
      int [] ans =   sortsquare(arr);
        System.out.println("sorted array : " );
        reversearray(ans);
        printarray(ans);
    }
}
