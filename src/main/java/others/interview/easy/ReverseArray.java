/**
 * Author: Thomas Nguyen
 * Date created: 2016/12/16
 * Interview date: 2014/07/31
 */

package others.interview.easy;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ReverseArray {
    // Permute all the data with the other half
    public static int[] reverseArray1(int[] array) {
        int[] result = array;

        int tmp;
        for (int i=0, arraySize=result.length; i<arraySize/2; i++) {
            tmp = result[i];
            result[i] = result[arraySize - 1 - i];
            result[arraySize - 1 - i] = tmp;
        }
        return result;
    }

    // Permute all the data into a DIFFERENT array (version1)
    public static int[] reverseArray2(int[] array) {
        int arraySize = array.length;
        int[] result = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
            result[arraySize-i-1] = array[i];
        return result;
    }

    // Permute all the data into a DIFFERENT array (version2)
    public static int[] reverseArray3(int[] array) {
        int arraySize = array.length;
        int[] result = new int[arraySize];

        int i = 0;
        int j = 0;
        for (i=0, j=arraySize-1; i<arraySize; i++, j--)
            result[j] = array[i];
        return result;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        //int[] myIntArray = new int[]{1,2,3,4,5};

        intArray = reverseArray1(intArray);
        System.out.println(Arrays.toString(intArray));
        intArray = reverseArray2(intArray);
        System.out.println(Arrays.toString(intArray));
        intArray = reverseArray3(intArray);
        System.out.println(Arrays.toString(intArray));

        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}