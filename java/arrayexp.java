package array.java;

public class arrayexp {

    void sumOfArray() {
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }

    void multiarray() {
        int[][] arr = {{56, 43, 6}, {34, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }

        }
    }

    void demoArray() {
        int[] ages = new int[5];
        float[] weights = new float[3];
        String[] names = {"ali", "rahu", "asma"};

        ages[0] = 10;
        ages[1] = 34;
        ages[2] = 20;
        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        }
        //for each loop
        for (int age : ages) {
            System.out.println(age);
        }
        //while loop
        int i = 0;
        while (i < 3) {
            System.out.println(ages[i]);
            i += 1;

        }
    }

}
class hassan {
    public static void main(String[] args) {
        arrayexample obj = new arrayexample();
        //   obj.demoArray();
        //   obj.multiarray();

    }

}
