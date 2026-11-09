

import java.util.Arrays;
public class ReverseArray{


        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5, 6};

            System.out.println("Original Array: " + Arrays.toString(arr));

            int n = arr.length;

            // Swapping elements
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }

            System.out.println("Swapped Array: " + Arrays.toString(arr));
        }
    }





