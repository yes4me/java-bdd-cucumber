package others.interview_qa.easy.unit_test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Thomas on 12/29/2016.
 */
public class ListConvert {
    // convert int[] to LinkedList
    public static List<Integer> convert(int[] myArray) {
        List<Integer> result = new LinkedList<>();
        for (int i=0, size=myArray.length; i<size; i++) {
            result.add(myArray[i]);
        }
        return result;
    }
    // convert LinkedList to int[]
    public static int[] convert(List<Integer> myList) {
        if (myList == null) {
            int[] myArray = {};
            return myArray;
        }
        return myList.stream().mapToInt(i->i).toArray();
    }
}
