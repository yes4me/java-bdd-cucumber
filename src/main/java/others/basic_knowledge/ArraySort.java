package others.basic_knowledge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Thomas on 12/21/2016.
 */
public class ArraySort {
    // sort by value! Keep all values
    // However, what is getting passed by value here is the reference to the array, not the array itself
    public static void sortArray_v1(int[] myArray) {
        // Sort myArray in the main() using QUICKSORT!
        Arrays.sort(myArray);
    }
    // sort by value! NO DUPLICATE!
    public static int[] sortArray_v2(int[] myArray) {
        // Set removes duplicate value automatically
        Set<Integer> mySet = new HashSet<Integer>();
        for (int i=0, size=myArray.length; i<size; i++){
            mySet.add(myArray[i]);
        }

        // get back an array
        int[] result = new int[mySet.size()];
        int index    = 0;
        for (Iterator<Integer> it=mySet.iterator(); it.hasNext();) {
            result[index++] = it.next();
        }
        return result;
    }


    public static void main(String[] args) {
        int[] myArray = {1, 5, 2, 7, 2, -1};
        int[] myArray2 = sortArray_v2(myArray);

        // Sort an array (pick either method):
        System.out.println("ORIGINAL: " + Arrays.toString(myArray));
        System.out.println("myArray2: " + Arrays.toString(myArray2));
        sortArray_v1(myArray);
        System.out.println("sorted_v1(): " + Arrays.toString(myArray));
    }
}
