/**
 * Author: Thomas Nguyen
 * Date created: 2016/12/22
 *
 * find the common elements between 3 arrays
 */

package others.interview.easy;

import java.util.HashMap;
import java.util.Map;

public class ArrayCommon {
    static Map<Integer, Integer> valueCounter = new HashMap();

    // Set the values of array into the map
    public static void setup(int[] myArray) {
        for (int i=0, size=myArray.length; i<size; i++) {
            Object o = valueCounter.get(myArray[i]);
            int counter = (o==null)? 0 : (int)o;
            valueCounter.put(myArray[i], ++counter);
        }
    }
    // Get the values of the map
    public static void getCommonElements() {
        for (Map.Entry<Integer, Integer> entry : valueCounter.entrySet()) {
            //System.out.println(entry.getKey() + "/" + entry.getValue());
            if (entry.getValue() == 3) {
                System.out.println(entry.getKey());
            }
        }
   }
    public static void main(String[] args) {
        int[] myArray1 = {-1, 2, 3, 5, 4};
        int[] myArray2 = {-1, 20, 3, 4, 5, 100};
        int[] myArray3 = {-1, 2, 3, 42, 5};

        setup(myArray1);
        setup(myArray2);
        setup(myArray3);
        System.out.println("Common values:");
        getCommonElements();
    }
}
