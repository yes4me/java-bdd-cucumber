/*
* Purpose: Comparing Operator + and concat
 * Author: Thomas Nguyen
 * Date created: 2016/12/22

Result: 2016/12/22, Java 1.8
    APPEND :	1.2314921080868106
Conclusion:
    Operator + is 125% slower than concat
*/

package others.performance_test.speed_concat;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_TEST = 10000;
        String result = "";
        double start = 0;
        double duration1 = 0;
        double duration2 = 0;

        // Add a string using operator +
        start = System.nanoTime();
        for (int i=0; i<NUMBER_TEST; i++)
            result += "a";
        duration1 = System.nanoTime() - start;

        // Add a string using concat
        start = System.nanoTime();
        for (int i=0; i<NUMBER_TEST; i++)
            result = result.concat("a");
        duration2 = System.nanoTime() - start;

        System.out.println("operator+ vs concat:");
        System.out.println("APPEND :\t" + duration1 / duration2);
    }
}
