/**
 * Author: Thomas Nguyen
 * Date created: 2016/12/21
 *
 * Goal: Given array of n integers and given a number X
 * find all the unique pairs of elements (a,b), whose summation is equal to X
 *
 * Questions to ask during interview:
 * - is the array sorted?
 * - are duplicate numbers allowed?
 * - can the numbers be negative?
 * - speed matter?
 */

package others.interview.normal;

import java.util.HashMap;
import java.util.Map;

public class ArrayCountSum {
    // Good: Easy solution, and work for unsorted array with any number
    // Bad: Slow O(n2) and "BAD" answer for interview
    public static int getPairsCount_v1(int[] myArray, int sum) {
        int size    = myArray.length;
        int count   = 0;

        for (int i=0; i<size-1; i++) {
            for (int j=i+1; j<myArray.length; j++) {
                if (myArray[i]+myArray[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }
    // Good: Tricky "solution"
    // Bad: Work only for SORTED array with NO duplicate (= we cannot twice the same numbers)
    public static int getPairsCount_v2(int[] myArray, int sum) {
        int size    = myArray.length;
        int count   = 0;

        int indexBegin  = 0;
        int indexEnd    = size-1;
        while (indexBegin < indexEnd) {
            if (myArray[indexBegin] + myArray[indexEnd] == sum) {
                count++;
                indexBegin++;
                indexEnd--;
            } else if (myArray[indexBegin] + myArray[indexEnd] < sum) {
                indexBegin++;
            } else {
                indexEnd--;
            }
        }
        return count;
    }

    // Good: BEST interview solution
    public static int getPairsCount_v3(int[] myArray, int sum)
    {
        int count = 0;

        // If you use boolean[], it only works for duplicate & negative values. You need to calculate the array size
        // If you use int[],     it only works for negative values
        Map<Integer, Integer> valueCounter = new HashMap();
        for (int i=0, size=myArray.length; i<size; i++) {
            int difference  = sum - myArray[i];

            int nbValue     = (valueCounter.get(difference)==null)? 0 : valueCounter.get(difference);
            count += nbValue;

            valueCounter.put(myArray[i], ++nbValue);
        }
        return count;
    }

    public static void main(String[] args) {
        //myArray1, myArray2 and myArray3 contain the same data

        int[] myArray1 = {6, 4, 4, 6, -10, 5};
        System.out.println("Solution v1: " + getPairsCount_v1(myArray1, 10) );

        int[] myArray2 = {-10, 4, 4, 5, 6, 6};
        System.out.println("Solution v2: " + getPairsCount_v2(myArray2, 10) );

        int[] myArray3 = {6, 4, 4, 6, -10, 5};
        System.out.println("Solution v3: " + getPairsCount_v3(myArray3, 10) );

        System.out.println("END");
    }
}
