import java.util.Scanner;

public class repeatingnum {
    static int firstreapeatingnumber(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j =i+1 ; j <n ; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }

            }

        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array size");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter"+n+ "element");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("first repeating number:" +firstreapeatingnumber(arr));
    }
}
