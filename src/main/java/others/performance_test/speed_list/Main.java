/*
* Purpose: Comparing ArrayList and LinkedList
 * Author: Thomas Nguyen
 * Date created: 2016/12/16

Source: http://www.javacreed.com/comparing-the-performance-of-various-list-implementations/
Result: 2016/12/16
    ADD ArrayList vs LinkedList:	2.360982999512459
    GET ArrayList vs LinkedList:	0.0019758275138858947
    SORT ArrayList vs LinkedList:	1.1590501778652456
    SIZE ArrayList vs LinkedList:	0.6376677017049953
Conclusion:
    ArrayList  is better for: GET, SIZE (= READING)
    LinkedList is better for: ADD, SORT (= WRITING)
*/

package others.performance_test.speed_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_TEST = 5000;
        PerformanceList performancelist = new PerformanceList();

        List arrayList    = new ArrayList();
        List linkedList   = new LinkedList();

        // insertion
        double timerArrayList1 = performancelist.addListTest(arrayList, NUMBER_TEST);
        double timerLinkedList1 = performancelist.addListTest(linkedList, NUMBER_TEST);

        // get
        double timerArrayList2 = performancelist.getListTest(arrayList, NUMBER_TEST);
        double timerLinkedList2 = performancelist.getListTest(linkedList, NUMBER_TEST);

        // sort
        double timerArrayList3 = performancelist.sortListTest(arrayList, NUMBER_TEST);
        double timerLinkedList3 = performancelist.sortListTest(linkedList, NUMBER_TEST);

        // ArrayList size
        double timerArrayList4 = performancelist.sizeListTest(arrayList, NUMBER_TEST);
        double timerLinkedList4 = performancelist.sizeListTest(linkedList, NUMBER_TEST);


        System.out.println("ADD ArrayList vs LinkedList:\t" + timerArrayList1 / timerLinkedList1);
        System.out.println("GET ArrayList vs LinkedList:\t" + timerArrayList2 / timerLinkedList2);
        System.out.println("SORT ArrayList vs LinkedList:\t" + timerArrayList3 / timerLinkedList3);
        System.out.println("SIZE ArrayList vs LinkedList:\t" + timerArrayList4 / timerLinkedList4);
    }
}
