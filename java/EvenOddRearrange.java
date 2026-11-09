import java.util.*;

public class EvenOddRearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // take array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // rearrange even and odd
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (a[left] % 2 != 0 && a[right] % 2 == 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            else if (a[left] % 2 == 0) {
                left++;
            }
            else {
                right--;
            }
        }

        // print result
        System.out.println("Rearranged array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
