import java.util.Arrays;
import java.util.Scanner;
class multirray {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Reversing the array
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}


