/*
* Purpose: Comparing ArrayList and LinkedList
* Author: Thomas Nguyen
* Date started: 2016/12/16
* Last update: 2016/12/16

Source: http://www.javacreed.com/comparing-the-performance-of-various-list-implementations/
Result: 2016/12/16
    ADD ArrayList vs LinkedList:	4.998746642803139
    GET ArrayList vs LinkedList:	0.007662274819786448
    SORT ArrayList vs LinkedList:	2.215224417590495
    SIZE ArrayList vs LinkedList:	0.6315239233841223
Conclusion:
    ArrayList  is better for: GET, SIZE
    LinkedList is better for: ADD, SORT
*/

package performance_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_TEST  = 5000;
        PerformanceList performancelist = new PerformanceList();

        double timerArrayList1  = 0;
        double timerArrayList2  = 0;
        double timerArrayList3  = 0;
        double timerArrayList4  = 0;
        double timerLinkedList1 = 0;
        double timerLinkedList2 = 0;
        double timerLinkedList3 = 0;
        double timerLinkedList4 = 0;

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // ArrayList insertion
        timerArrayList1 = performancelist.addListTest(arrayList, NUMBER_TEST);
        // timerArrayList1 /= NUMBER_TEST;
        //System.out.println("ArrayList add:\t"+ timerArrayList1 );

        // ArrayList get
        timerArrayList2 = performancelist.getListTest(arrayList, NUMBER_TEST);
        // timerArrayList2 /= NUMBER_TEST;
        //System.out.println("ArrayList get:\t"+ timerArrayList2 );

        // ArrayList sort
        timerArrayList3 = performancelist.sortListTest(arrayList, NUMBER_TEST);
        // timerArrayList3 /= NUMBER_TEST;
        //System.out.println("ArrayList sort:\t"+ timerArrayList3 );

        // ArrayList size
        timerArrayList4 = performancelist.sizeListTest(arrayList, NUMBER_TEST);
        // timerArrayList4 /= NUMBER_TEST;
        // System.out.println("ArrayList size:\t"+ timerArrayList4 );


        // LinkedList insertion
        timerLinkedList1 = performancelist.addListTest(linkedList, NUMBER_TEST);
        // timerLinkedList1 /= NUMBER_TEST;
        //System.out.println("LinkedList add:\t"+ timerLinkedList1 );

        // LinkedList get
        timerLinkedList2 = performancelist.getListTest(linkedList, NUMBER_TEST);
        // timerLinkedList2 /= NUMBER_TEST;
        //System.out.println("LinkedList get:\t"+ timerLinkedList2 );

        // LinkedList sort
        timerLinkedList3 = performancelist.sortListTest(linkedList, NUMBER_TEST);
        // timerLinkedList3 /= NUMBER_TEST;
        //System.out.println("LinkedList sort:\t"+ timerLinkedList3 );

        // LinkedList size
        timerLinkedList4 = performancelist.sizeListTest(linkedList, NUMBER_TEST);
        // timerLinkedList4 /= NUMBER_TEST;
        // System.out.println("LinkedList size:\t"+ timerLinkedList4 );


        System.out.println("ADD ArrayList vs LinkedList:\t"+ timerArrayList1/timerLinkedList1 );
        System.out.println("GET ArrayList vs LinkedList:\t"+ timerArrayList2/timerLinkedList2 );
        System.out.println("SORT ArrayList vs LinkedList:\t"+ timerArrayList3/timerLinkedList3 );
        System.out.println("SIZE ArrayList vs LinkedList:\t"+ timerArrayList4/timerLinkedList4 );
    }
}
