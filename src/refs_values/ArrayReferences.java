package refs_values;

import java.util.Arrays;

public class ArrayReferences {

    private static void modifyArray(int[] arr){
        arr[1] = 2;
    }

    public static void main(String[] args) {
        int[] myIntArr = new int[5];
        int[] anotherArr = myIntArr;

        modifyArray(myIntArr);

        System.out.println("myIntArr" + Arrays.toString(myIntArr));
        System.out.println("anotherArr" + Arrays.toString(anotherArr));

        anotherArr[0] = 1;

        System.out.println("myIntArr" + Arrays.toString(myIntArr));
        System.out.println("anotherArr" + Arrays.toString(anotherArr));

    }


}
