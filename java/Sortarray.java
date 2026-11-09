import java.util.Scanner;


public class Sortarray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1, 0};

        int countZero = 0;

        // Count zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }

        // Fill zeros
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        // Fill ones
        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print sorted array
        System.out.println("sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



