/*
* Purpose: Comparing ArrayList and LinkedList
 * Author: Thomas Nguyen
 * Date created: 2016/12/16

Source: http://www.javacreed.com/comparing-the-performance-of-various-list-implementations/
Result: 2016/12/16, Java 1.8
    APPEND :	1.175199870554452
    INSERT :	0.18063393332252423
    REVERSE:	0.22040319617441886
    GET SIZE:	0.9435047402486113
Conclusion:
    StringBuffer  is better for: INSERT, REVERSE
    StringBuilder is better for: APPEND
*/

package performance_string;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_TEST  = 20000;
        PerformanceString performanceString = new PerformanceString();

        // append = add strings at the end
        double timerStringBuffer1  = performanceString.stringBufferTestAppend(NUMBER_TEST);
        double timerStringBuilder1 = performanceString.stringBuilderTestAppend(NUMBER_TEST);

        // insert = add strings wherever you want
        double timerStringBuffer2  = performanceString.stringBufferTestInsert(NUMBER_TEST);
        double timerStringBuilder2 = performanceString.stringBuilderTestInsert(NUMBER_TEST);

        // reverse
        double timerStringBuffer3  = performanceString.stringBufferTestReverse(NUMBER_TEST);
        double timerStringBuilder3 = performanceString.stringBuilderTestReverse(NUMBER_TEST);

        // get the size
        double timerStringBuffer4  = performanceString.stringBufferTestLength(NUMBER_TEST);
        double timerStringBuilder4 = performanceString.stringBuilderTestLength(NUMBER_TEST);

        System.out.println("StringBuffer vs StringBuilder:");
        System.out.println("APPEND :\t"+ timerStringBuffer1/timerStringBuilder1 );
        System.out.println("INSERT :\t"+ timerStringBuffer2/timerStringBuilder2 );
        System.out.println("REVERSE:\t"+ timerStringBuffer3/timerStringBuilder3 );
        System.out.println("GET SIZE:\t"+ timerStringBuffer4/timerStringBuilder4 );
    }
}
