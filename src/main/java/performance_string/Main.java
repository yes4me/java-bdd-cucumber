/*
* Purpose: Comparing ArrayList and LinkedList
* Author: Thomas Nguyen
* Date started: 2016/12/16
* Last update: 2016/12/16

Source: http://www.javacreed.com/comparing-the-performance-of-various-list-implementations/
Result: 2016/12/16, Java 1.8
    APPEND :	1.0788560225930386
    INSERT :	0.18371575713139185
    REVERSE:	0.2353250440037923
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

        double timerStringBuffer1   = 0;
        double timerStringBuffer2   = 0;
        double timerStringBuffer3   = 0;
        double timerStringBuilder1  = 0;
        double timerStringBuilder2  = 0;
        double timerStringBuilder3  = 0;

        // StringBuffer append = add strings at the end
        timerStringBuffer1 = performanceString.stringBufferTestAppend(NUMBER_TEST);
        // timerStringBuffer1 /= NUMBER_TEST;
        // System.out.println("StringBuffer append:\t"+ timerStringBuffer1 );

        // StringBuilder append = add strings at the end
        timerStringBuilder1 = performanceString.stringBuilderTestAppend(NUMBER_TEST);
        // timerStringBuilder1 /= NUMBER_TEST;
        // System.out.println("StringBuilder append:\t"+ timerStringBuilder1 );


        // StringBuffer insert = add strings wherever you want
        timerStringBuffer2 = performanceString.stringBufferTestInsert(NUMBER_TEST);
        // timerStringBuffer2 /= NUMBER_TEST;
        // System.out.println("StringBuffer insert:\t"+ timerStringBuffer2 );

        // StringBuilder insert = add strings at the end
        timerStringBuilder2 = performanceString.stringBuilderTestInsert(NUMBER_TEST);
        // timerStringBuilder2 /= NUMBER_TEST;
        // System.out.println("StringBuilder insert:\t"+ timerStringBuilder2 );


        // StringBuffer reverse
        timerStringBuffer3 = performanceString.stringBufferTestReverse(NUMBER_TEST);
        // timerStringBuffer3 /= NUMBER_TEST;
        // System.out.println("StringBuffer insert:\t"+ timerStringBuffer3 );

        // StringBuilder reverse
        timerStringBuilder3 = performanceString.stringBuilderTestReverse(NUMBER_TEST);
        // timerStringBuilder3 /= NUMBER_TEST;
        // System.out.println("StringBuilder insert:\t"+ timerStringBuilder3 );


        System.out.println("StringBuffer vs StringBuilder:");
        System.out.println("APPEND :\t"+ timerStringBuffer1/timerStringBuilder1 );
        System.out.println("INSERT :\t"+ timerStringBuffer2/timerStringBuilder2 );
        System.out.println("REVERSE:\t"+ timerStringBuffer3/timerStringBuilder3 );
    }
}
