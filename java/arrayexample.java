package array.java;

 public class arrayexample {
     void multiarray(){
      //   int [][] arr_1= new int[5][4];
int [][] arr_1 = {{1,2,3},{5,6,7},{4,6,5}};
        System.out.println(arr_1[0][0]);
         System.out.println(arr_1[0][1]);
         System.out.println(arr_1[0][2]);
         System.out.println(arr_1[1][0]);
         System.out.println(arr_1[1][1]);
         System.out.println(arr_1[1][2]);
         System.out.println(arr_1[2][0]);
         System.out.println(arr_1[2][1]);
         System.out.println(arr_1[2][2]);

     }
     void demoArray() {
         int[] ages = new int[5];
         float[] weights = new float[3];
         String[] names = {"ali", "rahu", "asma"};
         System.out.println(ages.length);
         System.out.println(weights.length);
         System.out.println(names.length);
         ages[0] = 10;
         ages[1] = 34;
         ages[2] = 20;
         System.out.println(ages[0]);
         System.out.println(ages[1]);
         System.out.println(ages[2]);
         System.out.println(names[0]);
         System.out.println(names[1]);
         System.out.println(names[2]);
     }
 }
    class ali{
      public   static void main(String[] args) {
            arrayexample obj = new arrayexample();
            obj.demoArray();
        //  obj.multiarray();
        }
    }
