/**
 * Author: Thomas Nguyen
 * Date created: 2016/12/18
 * Interview date: 2016/12/18
 *
 * prints the numbers from 1 to 100
 * for multiples:
 * - of 3, print “Fizz” instead of the number
 * - of 5, print “Buzz”
 * - of 3 and 5, print “FizzBuzz”.
 */

package others.interview.easy;

public class Fizzbuzz {
    public static String fizzbuzz(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        return (result == "") ? Integer.toString(number) : result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + fizzbuzz(i));
        }
    }
}
