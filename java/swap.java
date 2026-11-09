

public class swap {
    static void swap(int a,int b){
        System.out.println("original values before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
int temp = a;//temp = 3
        a=b;
        b= temp;
        // a=3, b= 9
        System.out.println("original values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
  public  static void main(String[] args) {
        int a = 9;
        int b = 3;
        int arr[]= {1,2,3,4,5};
        swap(a,b);
    }
}
