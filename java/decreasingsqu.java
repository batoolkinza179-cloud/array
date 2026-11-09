import java.util.*;

public class decreasingsqu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // array input (non-decreasing)
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // square each element
        for (int i = 0; i < n; i++) {
            a[i] = a[i] * a[i];
        }

        // sort again
        Arrays.sort(a);

        // output
        System.out.println("Sorted squares:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}



