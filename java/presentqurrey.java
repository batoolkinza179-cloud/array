import java.util.Scanner;

public class presentqurrey {
    static int []makefrequencyarray(int[]arr){
        int []freq= new int[100005];
        for (int i = 0; i < arr.length ; i++) {
            freq[arr[i]]++;

        }
        return freq;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array size");
        int n = sc.nextInt();
        int [ ]arr= new int [n];
        System.out.println("enter"+n+"element");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int []freq = makefrequencyarray(arr);
        System.out.print("enter a number of qurries");
        int q = sc.nextInt();

        while (q>0){
            System.out.print("enter a no to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            q--;

        }
    }
}
