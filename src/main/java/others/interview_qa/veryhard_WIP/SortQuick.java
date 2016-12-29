/* [WIP]
 * Created by Thomas on 12/16/2016.
 * Asked on 2016/12/17
 *
 * Quick sort:
 * - pick a pivot (a random value, the first value, a value in the middle, or a value based on the first and last number, etc...)
 * - put all the numbers smaller to the left side of the pivot and the other to the right side (= divide and conquer)
 * - splice the result and do that over and over
 */
package others.interview_qa.veryhard_WIP;

import others.interview_qa.easy.unit_test.ListConvert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortQuick {
    private static List<Integer> combineList(List<Integer> list1, List<Integer> list2) {
        if ((list1 == null) && (list2 == null)) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        List<Integer> result = new LinkedList<>();
        //WAY#1
        result = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        //WAY#2
        //result.addAll(list1);
        //result.addAll(list2);
        return result;
    }


    // pick a pivot: the middle value
    private static int getPivotValue(List<Integer> myList) {
        int pivot = myList.size() / 2;
        return myList.get(pivot);
    }

    private static List<Integer> sort(List<Integer> myList) {
        int size = myList.size();
        if (size < 2) {
            return myList;
        }

        // pick a pivot = In this case, I picked the middle number
        int pivotValue = getPivotValue(myList);

        List<Integer> resultLeft = new LinkedList<>();
        List<Integer> resultMiddle = new LinkedList<>();
        List<Integer> resultRight = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int value = myList.get(i);
            if (value < pivotValue) {
                resultLeft.add(value);
            } else if (value > pivotValue) {
                resultRight.add(value);
            } else {
                resultMiddle.add(value);
            }
        }

        if (resultLeft.size() != 0) {
            resultLeft = sort(resultLeft);
        }
        if (resultRight.size() != 0) {
            resultRight = sort(resultRight);
        }
        return combineList(combineList(resultLeft, resultMiddle), resultRight);
    }

    public static int[] sort(int[] myArray) {
        List<Integer> result = ListConvert.convert(myArray);

        result = sort(result);
        return ListConvert.convert(result);
    }

    public static void main(String[] args) {
        int[] myArray = {5, 2, 3, 1, 2};

        myArray = sort(myArray);
        System.out.println("sort: " + Arrays.toString(myArray));
    }
}
