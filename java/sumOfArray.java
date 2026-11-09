package array.java;

 class sum{
     void searchInArray(){
         int[] arr = {10,5,3,5,2,8,4};
         int x=2;
         int ans =-1;
         for (int i = 0; i <arr.length ; i++) {
             if(arr[i]==x){
                 ans =i;
             }

         }
         System.out.println("found"+ x + "at index" + ans);
     }

     void maxOfArray(){
         int[] arr ={5,3,6,2,8};
         int ans =0;

         for (int i = 0; i <arr.length ; i++) {
             if(arr[i]>ans){
                 ans =arr[i];

             }

         }
         System.out.println("max"+ ans);
     }
    void sumOfArray() {
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }

}
public class sumOfArray{
    static void main(String[] args) {
        sum obj = new sum();
       // obj.sumOfArray();
      //  obj.maxOfArray();
        obj.searchInArray();
    }
}