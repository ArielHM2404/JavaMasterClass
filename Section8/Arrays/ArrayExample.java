package Section8.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

//        int[] myIntArray = new int[10];
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        int[] myIntArray2 = new int[10];
        double[] myDoubleArray = new double[10];
        myIntArray[5] = 415;
        myDoubleArray[4] = 30;
//       System.out.println(myDoubleArray[4] +", "+ myIntArray[5]);

        for (int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i*10;
        }

        for (int i = 0; i < myIntArray2.length; i++) {
            System.out.println(myIntArray2[i]);
        }

    }


}
