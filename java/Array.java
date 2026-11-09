class ArrayExample{
    void demoArrays(){
        int [] ages = new int[3];
        float[] weights = new float[3];
        String[]names = {"RAHUL","RAJ","ALI"};

        ages[0]= 34;
        ages[1]= 12;
        ages[2]=45;
        // ages [5] = 45;//OUT OF BOUND

       // weights[0]= 23.8f;
      //  weights[1]=87.5f;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }



}

public class Array {
    static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArrays();
    }
}
