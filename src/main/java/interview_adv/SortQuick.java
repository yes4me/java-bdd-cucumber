/*
 * Created by Thomas on 12/16/2016.
 * Asked on 2016/12/17
 *
 * Quick sort:
 * - pick a pivot (a random value, the first value, a value in the middle, or a value based on the first and last number, etc...)
 * - put all the numbers smaller to the left side of the pivot and the other to the right side (= divide and conquer)
 * - splice the result and do that over and over
 */
package interview_adv;

import java.util.Arrays;
import java.util.LinkedList;

public class SortQuick {
    /*
    public static int[] sort(int[] myArray) {
        if (myArray.length <2) {
            return myArray;
        }

        // pick a pivot = In this case, I picked the middle number
        int pivotIndex  = myArray.length/2;
        int pivotValue	= myArray[pivotIndex];
        LinkedList resultLeft    = new LinkedList();
        LinkedList resultRight   = new LinkedList();

        for (int i=0, size=myArray.length; i<size; i++) {
            if (i != pivotIndex) {
                if (myArray[i] < pivotValue)
                    resultLeft.push( myArray[i] );
                else
                    resultRight.push( myArray[i] );
            }
        }


        //int[] leftArray = resultLeft.toArray(new int[resultLeft.size()]);
        // Integer[] asd = new Integer(4);

        // Do not calculate with pivotValue anymore
        // return quickSort(leftArray).concat(pivotValue, quickSort(resultRight));
        return null;
    }
    */

    public static int[] numbers;
    public static int number;

    public static void sort2(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private static void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private static void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }


    public static void main(String [] args) {
        int[] myArray = {5,4,3,2,1};

        //sort(myArray);
        // http://www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html
        // http://www.java2novice.com/java-sorting-algorithms/quick-sort/
        System.out.println("sort: "+ Arrays.toString(numbers));
    }
}
