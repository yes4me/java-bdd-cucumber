/*
 * Created by Thomas on 12/16/2016.
 * Asked on 2016/12/17
 *
 * Merge sort:
 * divide the array in 2 parts until it cannot, and then combine and rearrange them
 */
package others.interview_qa.veryhard_WIP;

import java.util.Arrays;

public class SortMerge {
    public static int[] mergeArray(int[] array1, int[] array2) {
        int array1Length = array1.length;
        int array2Length = array2.length;
        int[] result = new int[array1Length + array2Length];

        int index1 = 0;
        int index2 = 0;
        while ((index1 < array1Length) && (index2 < array2Length)) {
            if (array1[index1] <= array2[index2]) {
                result[index1 + index2] = array1[index1];
                index1++;
            } else {
                result[index1 + index2] = array2[index2];
                index2++;
            }
        }
        for (int i = index1; i < array1Length; i++) {
            result[i + index2] = array1[i];
        }
        for (int i = index2; i < array2Length; i++) {
            result[i + index1] = array2[i];
        }

        return result;
    }

    public static int[] sort(int[] myArray) {
        int size = myArray.length;
        if (size < 2) {
            return myArray;
        }

        int halfsize = size / 2;
        int[] array1 = Arrays.copyOfRange(myArray, 0, halfsize);
        int[] array2 = Arrays.copyOfRange(myArray, halfsize, size);

        return mergeArray(sort(array1), sort(array2));
    }

    public static void main(String[] args) {
        int[] myArray = {5, 2, 3, 1, 2};

        myArray = sort(myArray);
        System.out.println("sort: " + Arrays.toString(myArray));
    }
}
