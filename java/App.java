package array.java;

public class App {
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println( );
    }
    static  void change_array(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] =0;

        }
    }
    static void change_val(int a){
        a= 1004;
    }
    static void main(String[] args) {
        int a =5;
        change_val(a);
        System.out.println(a);


      int  [] arr = new int [3];
      arr[0] = 5;
      arr[1] = 6;
      arr[2] =7;
      change_array(arr);
      printarray(arr);

    }
}
