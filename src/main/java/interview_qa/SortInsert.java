/*
 * Created by Thomas on 12/16/2016.
 * Asked on 2016/12/16
 *
 * Insertion sort:
 * - Keep the left side in order as it keeps checking one item at the time (n x n)
 * - complexity = n(n-1)/2 AT WORST
  * - Bubble sort < Selection sort < Insertion sort
*/
package interview_qa;

import java.util.Arrays;

public class SortInsert {
    public static int[] insertSort(int[] myArray) {
        if (myArray.length < 2) {
            return myArray;
        }

        for (int newIndex=1, size=myArray.length; newIndex<size; newIndex++) {
            int newValue    = myArray[newIndex];
            int i           = newIndex-1;

            for (; i>=0 && myArray[i]>newValue; i--) {
                myArray[i+1] = myArray[i];
            }
            // We have to update myArray[i+1] because the for loop ends by removing 1 from i
            myArray[i+1] = newValue;
        }
        return myArray;
    }
    public static void main(String [] args) {
        int[] myArray = {5,3,4,1,2};

        myArray = insertSort(myArray);
        System.out.println("insert sort: "+ Arrays.toString(myArray));
    }
}
