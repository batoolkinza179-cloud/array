

public class swapp {
    static  void swapwithouttemp(int a, int b){





            System.out.println("original values before swap");
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            a= a+b;
            b= a-b;
            a = a-b;


            // a=3, b= 9
            System.out.println("original values after swap");
            System.out.println("a: " + a);
            System.out.println("b: " + b);


        }
        public  static void main(String[] args) {
            int a = 9;
            int b = 3;
            int arr[]= {1,2,3,4,5};
            swapwithouttemp(a,b);

    }

}
