/*
 * Created by Thomas on 12/16/2016.
 * Asked on 2016/12/16
 *
 * Selection sort:
 * - Look at the smallest value and put it in the first position and so on
 * - complexity = n(n-1)/2 ALWAYS
  * - Bubble sort < Selection sort < Insertion sort
*/
package interview_qa;

import java.util.Arrays;

public class SortSelection {
    public static int[] selectionSort(int[] myArray) {
        if (myArray.length < 2) {
            return myArray;
        }

        int size = myArray.length;
        for (int i=0, sizei= size-1; i<sizei; i++) {
            int indexMin = i;
            for (int j=i+1; j<size; j++) {
                if (myArray[indexMin] > myArray[j]) {
                    indexMin = j;
                }
                // System.out.println(i +"/"+ j +" : "+ indexMin);
            }
            // swap i and indexMin
            int tmp             = myArray[indexMin];
            myArray[indexMin]   = myArray[i];
            myArray[i]          = tmp;
            // System.out.println("==>"+ Arrays.toString(myArray));
        }
        return myArray;
    }
    public static void main(String [] args) {
        int[] myArray = {5,3,4,1,2};

        myArray = selectionSort(myArray);
        System.out.println("selection sort: "+ Arrays.toString(myArray));
    }
}
