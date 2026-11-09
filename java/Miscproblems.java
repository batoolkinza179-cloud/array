package array.java;

public class Miscproblems {
    static void swapwithouttemp(int a, int b){
        System.out.println("original value before swap");
        System.out.println("a" + a);
        System.out.println("b" + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("original value  after swap");
        System.out.println("a" + a);
        System.out.println("b" + b);



    }
    static void swap(int a, int b){
        System.out.println("original value before swap");
        System.out.println("a" + a);
        System.out.println("b" + b);
        int temp = a;
        a= b;
        b =temp;
        System.out.println("original value  after swap");
        System.out.println("a" + a);
        System.out.println("b" + b);

    }
 //  static int [] reversearray(int [] arr){
   //     int n  = arr.length;
  //      int [] ans = new  int [n];
  //      int j =0;
   //     for (int i = n-1; i >=0; i--) {
   //         ans [j++] = arr[i];


    //    }
    //    return ans;
//    }
    static void swapinarraey(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reversearray(int[] arr){
        int i =0, j= arr.length-1;
        while (i<j){
            swapinarraey(arr,i,j);
            i++;
            j--;
        }

    }
    static  void printarray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
        }
    static void main(String[] args) {
        int a=9;
        int b = 3;
        int [] arr ={1,2,3,4,5};
       // swap(a,b);
      //
        // swapwithouttemp(a,b);
        reversearray(arr);
        printarray(arr);


    }
}
