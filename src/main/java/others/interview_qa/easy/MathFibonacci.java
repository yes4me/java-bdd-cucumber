/*
 * Author: Thomas Nguyen
 * Date created: 2016/12/18
 *
 * The Fibonacci sequence are a following integer sequence where:
 * - the first two numbers in the Fibonacci sequence are 0 and 1
 * - each subsequent number is the sum of the previous two
 *
 * On my computer:
 * when computing factorial(16): fibonacci_v1 = fibonacci_v2
 * when computing factorial(30): fibonacci_v1 is 190% faster than fibonacci_v2
 */
package others.interview_qa.easy;

public class MathFibonacci {
    public static int fibonacci_v1(int n) {
        int value0 = 0;
        int value1 = 1;
        int result = 0;

        if (n == 0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            result = value0 + value1;
            value0 = value1;
            value1 = result;
        }
        return result;
    }

    // GOOD: Easier to write and understand
    // BAD: very slow
    public static int fibonacci_v2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci_v2(n - 1) + fibonacci_v2(n - 2);
    }

    public static void main(String[] args) {
        final int NUMBER = 16;
        long time1 = 0, time2 = 0;
        long start = 0;

        // First way
        start = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            System.out.println(i + ": fibonacci=" + fibonacci_v1(i));
        }
        time1 = System.nanoTime() - start;

        // Second way
        start = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            System.out.println(i + ": fibonacci=" + fibonacci_v2(i));
        }
        time2 = System.nanoTime() - start;


        double result = (double) time1 / time2;
        System.out.println("fibonacci_v1 vs fibonacci_v2: " + result);
    }
}
