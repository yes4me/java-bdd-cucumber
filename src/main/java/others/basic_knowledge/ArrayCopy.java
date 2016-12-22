package others.basic_knowledge;

import java.util.Arrays;

/**
 * Created by Thomas on 12/21/2016.
 */
public class ArrayCopy {
    // Ways to copy an array of: numbers and strings
    public static int[] copyArray_v1(int[] myArray) {
        int[] newArray = Arrays.copyOf(myArray, myArray.length);
        return newArray;
    }
    public static int[] copyArray_v2(int[] myArray) {
        return myArray.clone();
    }

    public static void main(String[] args) {
        int[] myArray = {1, 5, 2, 7, 2, -1};

        int[] myArray1 = copyArray_v1(myArray);
        int[] myArray2 = copyArray_v2(myArray);

        System.out.println("ORIGINAL: " + Arrays.toString(myArray));
        System.out.println("myArray1: " + Arrays.toString(myArray1));
        System.out.println("myArray2: " + Arrays.toString(myArray2));

        String[] myString = {"aa", "bb", "cc"};
        String[] tmp = Arrays.copyOf(myString, myString.length);
        System.out.println(Arrays.toString(myString));
        System.out.println(Arrays.toString(tmp));
    }
}
