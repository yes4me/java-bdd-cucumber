/*
 * Author: Thomas Nguyen
 * Date created: 2016/12/18
 * Interview date: 2014/07/31
 *
 * factorial_v1 is 118% faster than factorial_v2
 */
package interview_normal;

public class MathFactorial {
    // This is 118% faster than factorial_v2
    public static double factorial_v1(int n) {
        if (n <= 1) {
            return 1;
        }

        double result = 1;
        for (int i=2; i<=n; i++)
            result *= i;
        return result;
    }
    // This was the question asked for interview, but this is slow
    public static double factorial_v2(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial_v2(n-1);
        }
    }

    public static void main(String [] args) {
        final int NUMBER  = 50;
        long time1=0, time2=0;
        long start=0;

        start = System.nanoTime();
        double result1 = factorial_v1(NUMBER);
        time1 = System.nanoTime() - start;
        System.out.println("factorial_v1: "+ result1 +" (" + time1 + ") ns");

        start = System.nanoTime();
        double result2 = factorial_v2(NUMBER);
        time2 = System.nanoTime() - start;
        System.out.println("factorial_v2: "+ result2 +" (" + time2 + ") ns");

        double result = (double) time1/time2;
        System.out.println("factorial_v1 vs factorial_v2: " + result );
    }
}
