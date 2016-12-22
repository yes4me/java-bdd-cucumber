/*
 * Author: Thomas Nguyen
 * Date created: 2016/12/16
 *
 * Bubble sort:
 * - Permutate 2 numbers next to each other and make sure they are in order, and do that n times (n x n)
 * - complexity = О(n2) ALWAYS
  * - Bubble sort < Selection sort < Insertion sort
 */
package others.interview_normal;

import java.util.Arrays;

public class SortBubble {
    public static int[] sort(int[] myArray) {
        if (myArray.length < 2) {
            return myArray;
        }

        boolean nochange;
        do {
            nochange = false;
            for (int i = 0, size = myArray.length - 1; i < size; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    // swap i and i+1
                    int tmp = myArray[i + 1];
                    myArray[i + 1] = myArray[i];
                    myArray[i] = tmp;
                    nochange = true;
                }
            }
        } while (nochange);

        return myArray;
    }

    public static void main(String[] args) {
        int[] myArray = {5, 2, 3, 1, 2};

        myArray = sort(myArray);
        System.out.println("bubble sort: " + Arrays.toString(myArray));
    }
}
